package typings.jss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type Styles = std.Record<Name, jss.jss.JssStyle<Props, Theme> | std.Array<jss.jss.JssStyle<Props, Theme>> | string | jss.jss.Func<Props, Theme, jss.jss.JssStyle<undefined, undefined> | string | null | undefined> | jss.jss.MinimalObservable<jss.jss.JssStyle<any, undefined> | string | null | undefined>>
}}}
to avoid circular code involving: 
- jss.jss.JssStyle
- jss.jss.Styles
*/
@js.native
trait Styles[Name /* <: String | Double | js.Symbol */, Props, Theme] extends StObject
