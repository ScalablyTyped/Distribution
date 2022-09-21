package typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaControllerConfig extends StObject {
  
  var cmd: js.UndefOr[String | Null] = js.undefined
  
  var disks: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  var gcsLogPath: js.UndefOr[String | Null] = js.undefined
  
  var gcsSinks: js.UndefOr[StringDictionary[SchemaRepeatedString] | Null] = js.undefined
  
  var gcsSources: js.UndefOr[StringDictionary[SchemaRepeatedString] | Null] = js.undefined
  
  var image: js.UndefOr[String | Null] = js.undefined
  
  var machineType: js.UndefOr[String | Null] = js.undefined
  
  var vars: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaControllerConfig {
  
  inline def apply(): SchemaControllerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaControllerConfig]
  }
  
  extension [Self <: SchemaControllerConfig](x: Self) {
    
    inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setCmdNull: Self = StObject.set(x, "cmd", null)
    
    inline def setCmdUndefined: Self = StObject.set(x, "cmd", js.undefined)
    
    inline def setDisks(value: StringDictionary[String]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksNull: Self = StObject.set(x, "disks", null)
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setGcsLogPath(value: String): Self = StObject.set(x, "gcsLogPath", value.asInstanceOf[js.Any])
    
    inline def setGcsLogPathNull: Self = StObject.set(x, "gcsLogPath", null)
    
    inline def setGcsLogPathUndefined: Self = StObject.set(x, "gcsLogPath", js.undefined)
    
    inline def setGcsSinks(value: StringDictionary[SchemaRepeatedString]): Self = StObject.set(x, "gcsSinks", value.asInstanceOf[js.Any])
    
    inline def setGcsSinksNull: Self = StObject.set(x, "gcsSinks", null)
    
    inline def setGcsSinksUndefined: Self = StObject.set(x, "gcsSinks", js.undefined)
    
    inline def setGcsSources(value: StringDictionary[SchemaRepeatedString]): Self = StObject.set(x, "gcsSources", value.asInstanceOf[js.Any])
    
    inline def setGcsSourcesNull: Self = StObject.set(x, "gcsSources", null)
    
    inline def setGcsSourcesUndefined: Self = StObject.set(x, "gcsSources", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageNull: Self = StObject.set(x, "image", null)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeNull: Self = StObject.set(x, "machineType", null)
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setVars(value: StringDictionary[String]): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
    
    inline def setVarsNull: Self = StObject.set(x, "vars", null)
    
    inline def setVarsUndefined: Self = StObject.set(x, "vars", js.undefined)
  }
}
