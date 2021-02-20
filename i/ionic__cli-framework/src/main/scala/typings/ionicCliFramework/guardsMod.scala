package typings.ionicCliFramework

import typings.ionicCliFramework.definitionsMod.CommandMetadata
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.definitionsMod.ICommand
import typings.ionicCliFramework.definitionsMod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object guardsMod {
  
  @JSImport("@ionic/cli-framework/guards", "isCommand")
  @js.native
  def isCommand[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](obj: js.Any): /* is C */ Boolean = js.native
  
  @JSImport("@ionic/cli-framework/guards", "isHydratedCommandMetadata")
  @js.native
  def isHydratedCommandMetadata[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](obj: js.Any): /* is @ionic/cli-framework.@ionic/cli-framework/definitions.HydratedCommandMetadata<C, N, M, I, O> */ Boolean = js.native
  
  @JSImport("@ionic/cli-framework/guards", "isLinkFootnote")
  @js.native
  def isLinkFootnote(obj: js.Any): /* is @ionic/cli-framework.@ionic/cli-framework/definitions.LinkFootnote */ Boolean = js.native
  
  @JSImport("@ionic/cli-framework/guards", "isNamespace")
  @js.native
  def isNamespace[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](obj: js.Any): /* is N */ Boolean = js.native
  
  @JSImport("@ionic/cli-framework/guards", "isPackageJson")
  @js.native
  def isPackageJson(obj: js.Any): /* is @ionic/cli-framework.@ionic/cli-framework/definitions.PackageJson */ Boolean = js.native
}
