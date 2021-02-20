package typings.googleapis.composerV1beta1Mod.composerV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An environment for running orchestration tasks.
  */
@js.native
trait SchemaEnvironment extends StObject {
  
  /**
    * Configuration parameters for this environment.
    */
  var config: js.UndefOr[SchemaEnvironmentConfig] = js.native
  
  /**
    * Output only. The time at which this environment was created.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Optional. User-defined labels for this environment. The labels map can
    * contain no more than 64 entries. Entries of the labels map are UTF8
    * strings that comply with the following restrictions:  * Keys must conform
    * to regexp: \p{Ll}\p{Lo}{0,62} * Values must conform to regexp:
    * [\p{Ll}\p{Lo}\p{N}_-]{0,63} * Both keys and values are additionally
    * constrained to be &lt;= 128 bytes in size.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The resource name of the environment, in the form:
    * &quot;projects/{projectId}/locations/{locationId}/environments/{environmentId}&quot;
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The current state of the environment.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Output only. The time at which this environment was last modified.
    */
  var updateTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. The UUID (Universally Unique IDentifier) associated with
    * this environment. This value is generated when the environment is
    * created.
    */
  var uuid: js.UndefOr[String] = js.native
}
object SchemaEnvironment {
  
  @scala.inline
  def apply(): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironment]
  }
  
  @scala.inline
  implicit class SchemaEnvironmentMutableBuilder[Self <: SchemaEnvironment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: SchemaEnvironmentConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
