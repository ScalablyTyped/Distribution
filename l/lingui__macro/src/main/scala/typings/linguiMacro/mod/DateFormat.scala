package typings.linguiMacro.mod

import org.scalablytyped.runtime.TopLevel
import typings.linguiMacro.createFormatMod.FormatPropsWithoutI18n
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.std.Date
import typings.std.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lingui/macro", "DateFormat")
@js.native
class DateFormat protected ()
  extends Component[FormatPropsWithoutI18n[Date, DateTimeFormatOptions], ComponentState, js.Any] {
  def this(props: FormatPropsWithoutI18n[Date, DateTimeFormatOptions]) = this()
  def this(props: FormatPropsWithoutI18n[Date, DateTimeFormatOptions], context: js.Any) = this()
}
@JSImport("@lingui/macro", "DateFormat")
@js.native
object DateFormat extends TopLevel[
      ComponentClass[FormatPropsWithoutI18n[Date, DateTimeFormatOptions], ComponentState]
    ]
