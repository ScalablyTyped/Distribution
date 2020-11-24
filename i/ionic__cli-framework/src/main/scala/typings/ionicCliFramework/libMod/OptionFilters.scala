package typings.ionicCliFramework.libMod

import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.optionsMod.OptionPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/lib", "OptionFilters")
@js.native
object OptionFilters extends js.Object {
  
  def excludesGroups[O /* <: CommandMetadataOption */](groups: String): OptionPredicate[O] = js.native
  def excludesGroups[O /* <: CommandMetadataOption */](groups: js.Array[String]): OptionPredicate[O] = js.native
  
  def includesGroups[O /* <: CommandMetadataOption */](groups: String): OptionPredicate[O] = js.native
  def includesGroups[O /* <: CommandMetadataOption */](groups: js.Array[String]): OptionPredicate[O] = js.native
}
