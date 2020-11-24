package typings.linguiMacro.mod

import org.scalablytyped.runtime.TopLevel
import typings.linguiMacro.createFormatMod.FormatPropsWithoutI18n
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lingui/macro", "NumberFormat")
@js.native
class NumberFormat protected ()
  extends Component[FormatPropsWithoutI18n[Double, NumberFormatOptions], ComponentState, js.Any] {
  def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions]) = this()
  def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions], context: js.Any) = this()
}
@JSImport("@lingui/macro", "NumberFormat")
@js.native
object NumberFormat extends TopLevel[
      ComponentClass[FormatPropsWithoutI18n[Double, NumberFormatOptions], ComponentState]
    ]
