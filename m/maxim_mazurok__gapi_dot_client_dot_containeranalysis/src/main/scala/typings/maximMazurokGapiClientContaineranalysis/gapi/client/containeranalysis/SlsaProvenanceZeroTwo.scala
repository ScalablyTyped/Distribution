package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlsaProvenanceZeroTwo extends StObject {
  
  var buildConfig: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  var buildType: js.UndefOr[String] = js.undefined
  
  var builder: js.UndefOr[GrafeasV1SlsaProvenanceZeroTwoSlsaBuilder] = js.undefined
  
  var invocation: js.UndefOr[GrafeasV1SlsaProvenanceZeroTwoSlsaInvocation] = js.undefined
  
  var materials: js.UndefOr[js.Array[GrafeasV1SlsaProvenanceZeroTwoSlsaMaterial]] = js.undefined
  
  var metadata: js.UndefOr[GrafeasV1SlsaProvenanceZeroTwoSlsaMetadata] = js.undefined
}
object SlsaProvenanceZeroTwo {
  
  inline def apply(): SlsaProvenanceZeroTwo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlsaProvenanceZeroTwo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlsaProvenanceZeroTwo] (val x: Self) extends AnyVal {
    
    inline def setBuildConfig(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "buildConfig", value.asInstanceOf[js.Any])
    
    inline def setBuildConfigUndefined: Self = StObject.set(x, "buildConfig", js.undefined)
    
    inline def setBuildType(value: String): Self = StObject.set(x, "buildType", value.asInstanceOf[js.Any])
    
    inline def setBuildTypeUndefined: Self = StObject.set(x, "buildType", js.undefined)
    
    inline def setBuilder(value: GrafeasV1SlsaProvenanceZeroTwoSlsaBuilder): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
    
    inline def setBuilderUndefined: Self = StObject.set(x, "builder", js.undefined)
    
    inline def setInvocation(value: GrafeasV1SlsaProvenanceZeroTwoSlsaInvocation): Self = StObject.set(x, "invocation", value.asInstanceOf[js.Any])
    
    inline def setInvocationUndefined: Self = StObject.set(x, "invocation", js.undefined)
    
    inline def setMaterials(value: js.Array[GrafeasV1SlsaProvenanceZeroTwoSlsaMaterial]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
    
    inline def setMaterialsVarargs(value: GrafeasV1SlsaProvenanceZeroTwoSlsaMaterial*): Self = StObject.set(x, "materials", js.Array(value*))
    
    inline def setMetadata(value: GrafeasV1SlsaProvenanceZeroTwoSlsaMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
