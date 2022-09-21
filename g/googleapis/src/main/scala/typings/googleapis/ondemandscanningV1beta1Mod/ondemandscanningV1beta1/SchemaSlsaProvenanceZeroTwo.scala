package typings.googleapis.ondemandscanningV1beta1Mod.ondemandscanningV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSlsaProvenanceZeroTwo extends StObject {
  
  var buildConfig: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  var buildType: js.UndefOr[String | Null] = js.undefined
  
  var builder: js.UndefOr[SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaBuilder] = js.undefined
  
  var invocation: js.UndefOr[SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaInvocation] = js.undefined
  
  var materials: js.UndefOr[js.Array[SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaMaterial]] = js.undefined
  
  var metadata: js.UndefOr[SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaMetadata] = js.undefined
}
object SchemaSlsaProvenanceZeroTwo {
  
  inline def apply(): SchemaSlsaProvenanceZeroTwo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSlsaProvenanceZeroTwo]
  }
  
  extension [Self <: SchemaSlsaProvenanceZeroTwo](x: Self) {
    
    inline def setBuildConfig(value: StringDictionary[Any]): Self = StObject.set(x, "buildConfig", value.asInstanceOf[js.Any])
    
    inline def setBuildConfigNull: Self = StObject.set(x, "buildConfig", null)
    
    inline def setBuildConfigUndefined: Self = StObject.set(x, "buildConfig", js.undefined)
    
    inline def setBuildType(value: String): Self = StObject.set(x, "buildType", value.asInstanceOf[js.Any])
    
    inline def setBuildTypeNull: Self = StObject.set(x, "buildType", null)
    
    inline def setBuildTypeUndefined: Self = StObject.set(x, "buildType", js.undefined)
    
    inline def setBuilder(value: SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaBuilder): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
    
    inline def setBuilderUndefined: Self = StObject.set(x, "builder", js.undefined)
    
    inline def setInvocation(value: SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaInvocation): Self = StObject.set(x, "invocation", value.asInstanceOf[js.Any])
    
    inline def setInvocationUndefined: Self = StObject.set(x, "invocation", js.undefined)
    
    inline def setMaterials(value: js.Array[SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaMaterial]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
    
    inline def setMaterialsVarargs(value: SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaMaterial*): Self = StObject.set(x, "materials", js.Array(value*))
    
    inline def setMetadata(value: SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
