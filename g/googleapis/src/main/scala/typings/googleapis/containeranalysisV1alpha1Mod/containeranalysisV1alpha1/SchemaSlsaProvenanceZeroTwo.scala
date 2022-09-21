package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSlsaProvenanceZeroTwo extends StObject {
  
  /**
    * Lists the steps in the build.
    */
  var buildConfig: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * URI indicating what type of build was performed.
    */
  var buildType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies the entity that executed the recipe, which is trusted to have correctly performed the operation and populated this provenance.
    */
  var builder: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaBuilder] = js.undefined
  
  /**
    * Identifies the event that kicked off the build.
    */
  var invocation: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaInvocation] = js.undefined
  
  /**
    * The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on.
    */
  var materials: js.UndefOr[
    js.Array[SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMaterial]
  ] = js.undefined
  
  /**
    * Other properties of the build.
    */
  var metadata: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMetadata] = js.undefined
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
    
    inline def setBuilder(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaBuilder): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
    
    inline def setBuilderUndefined: Self = StObject.set(x, "builder", js.undefined)
    
    inline def setInvocation(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaInvocation): Self = StObject.set(x, "invocation", value.asInstanceOf[js.Any])
    
    inline def setInvocationUndefined: Self = StObject.set(x, "invocation", js.undefined)
    
    inline def setMaterials(value: js.Array[SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMaterial]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
    
    inline def setMaterialsVarargs(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMaterial*): Self = StObject.set(x, "materials", js.Array(value*))
    
    inline def setMetadata(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
