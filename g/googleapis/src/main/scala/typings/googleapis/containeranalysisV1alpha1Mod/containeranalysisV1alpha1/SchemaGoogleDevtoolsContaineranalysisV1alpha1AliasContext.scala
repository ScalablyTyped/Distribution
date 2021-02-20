package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An alias to a repo revision.
  */
@js.native
trait SchemaGoogleDevtoolsContaineranalysisV1alpha1AliasContext extends StObject {
  
  /**
    * The alias kind.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The alias name.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaGoogleDevtoolsContaineranalysisV1alpha1AliasContext {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsContaineranalysisV1alpha1AliasContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1AliasContext]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsContaineranalysisV1alpha1AliasContextMutableBuilder[Self <: SchemaGoogleDevtoolsContaineranalysisV1alpha1AliasContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
