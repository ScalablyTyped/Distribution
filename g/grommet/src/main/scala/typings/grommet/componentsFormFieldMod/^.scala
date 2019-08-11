package typings.grommet.componentsFormFieldMod

import typings.grommet.grommetStrings.placeholder
import typings.react.HTMLInputElement
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.InputHTMLAttributes
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/FormField", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val FormField: ComponentClass[
    FormFieldProps with (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      placeholder
    ]), 
    ComponentState
  ] = js.native
}

