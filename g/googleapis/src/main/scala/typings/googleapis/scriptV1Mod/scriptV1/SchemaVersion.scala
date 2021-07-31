package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource representing a script project version. A version is a
  * &quot;snapshot&quot; of a script project and is similar to a read-only
  * branched release. When creating deployments, the version to use must be
  * specified.
  */
trait SchemaVersion extends StObject {
  
  /**
    * When the version was created.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * The description for this version.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The script project&#39;s Drive ID.
    */
  var scriptId: js.UndefOr[String] = js.undefined
  
  /**
    * The incremental ID that is created by Apps Script when a version is
    * created. This is system assigned number and is immutable once created.
    */
  var versionNumber: js.UndefOr[Double] = js.undefined
}
object SchemaVersion {
  
  @scala.inline
  def apply(): SchemaVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersion]
  }
  
  @scala.inline
  implicit class SchemaVersionMutableBuilder[Self <: SchemaVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: Double): Self = StObject.set(x, "versionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "versionNumber", js.undefined)
  }
}
