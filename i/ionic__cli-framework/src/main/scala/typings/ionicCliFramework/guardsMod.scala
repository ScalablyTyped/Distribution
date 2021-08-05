package typings.ionicCliFramework

import typings.ionicCliFramework.definitionsMod.CommandMetadata
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.definitionsMod.ICommand
import typings.ionicCliFramework.definitionsMod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object guardsMod {
  
  @JSImport("@ionic/cli-framework/guards", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isCommand[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](obj: js.Any): /* is C */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommand")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is C */ Boolean]
  
  inline def isHydratedCommandMetadata[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](obj: js.Any): /* is @ionic/cli-framework.@ionic/cli-framework/definitions.HydratedCommandMetadata<C, N, M, I, O> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHydratedCommandMetadata")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @ionic/cli-framework.@ionic/cli-framework/definitions.HydratedCommandMetadata<C, N, M, I, O> */ Boolean]
  
  inline def isLinkFootnote(obj: js.Any): /* is @ionic/cli-framework.@ionic/cli-framework/definitions.LinkFootnote */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLinkFootnote")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @ionic/cli-framework.@ionic/cli-framework/definitions.LinkFootnote */ Boolean]
  
  inline def isNamespace[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](obj: js.Any): /* is N */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamespace")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is N */ Boolean]
  
  inline def isPackageJson(obj: js.Any): /* is @ionic/cli-framework.@ionic/cli-framework/definitions.PackageJson */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPackageJson")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @ionic/cli-framework.@ionic/cli-framework/definitions.PackageJson */ Boolean]
}
