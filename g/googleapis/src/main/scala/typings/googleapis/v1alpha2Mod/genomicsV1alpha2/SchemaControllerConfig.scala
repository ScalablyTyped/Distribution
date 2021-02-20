package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores the information that the controller will fetch from the server in
  * order to run. Should only be used by VMs created by the Pipelines Service
  * and not by end users.
  */
@js.native
trait SchemaControllerConfig extends StObject {
  
  var cmd: js.UndefOr[String] = js.native
  
  var disks: js.UndefOr[StringDictionary[String]] = js.native
  
  var gcsLogPath: js.UndefOr[String] = js.native
  
  var gcsSinks: js.UndefOr[StringDictionary[SchemaRepeatedString]] = js.native
  
  var gcsSources: js.UndefOr[StringDictionary[SchemaRepeatedString]] = js.native
  
  var image: js.UndefOr[String] = js.native
  
  var machineType: js.UndefOr[String] = js.native
  
  var vars: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaControllerConfig {
  
  @scala.inline
  def apply(): SchemaControllerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaControllerConfig]
  }
  
  @scala.inline
  implicit class SchemaControllerConfigMutableBuilder[Self <: SchemaControllerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmdUndefined: Self = StObject.set(x, "cmd", js.undefined)
    
    @scala.inline
    def setDisks(value: StringDictionary[String]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    @scala.inline
    def setGcsLogPath(value: String): Self = StObject.set(x, "gcsLogPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsLogPathUndefined: Self = StObject.set(x, "gcsLogPath", js.undefined)
    
    @scala.inline
    def setGcsSinks(value: StringDictionary[SchemaRepeatedString]): Self = StObject.set(x, "gcsSinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsSinksUndefined: Self = StObject.set(x, "gcsSinks", js.undefined)
    
    @scala.inline
    def setGcsSources(value: StringDictionary[SchemaRepeatedString]): Self = StObject.set(x, "gcsSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsSourcesUndefined: Self = StObject.set(x, "gcsSources", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    @scala.inline
    def setVars(value: StringDictionary[String]): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarsUndefined: Self = StObject.set(x, "vars", js.undefined)
  }
}
