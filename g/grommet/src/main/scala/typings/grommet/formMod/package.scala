package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object formMod {
  
  type TypedForm[T] = typings.react.mod.ComponentClass[
    typings.grommet.formMod.FormProps[T] with (typings.std.Omit[
      typings.react.mod.DetailedHTMLProps[
        typings.react.mod.FormHTMLAttributes[typings.std.HTMLFormElement], 
        typings.std.HTMLFormElement
      ], 
      typings.grommet.grommetStrings.onChange | typings.grommet.grommetStrings.onSubmit
    ]), 
    typings.react.mod.ComponentState
  ]
}
