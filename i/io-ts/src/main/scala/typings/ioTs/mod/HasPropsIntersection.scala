package typings.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type HasPropsIntersection = io-ts.io-ts.IntersectionType<std.Array<io-ts.io-ts.HasProps>, any, any, any>
}}}
to avoid circular code involving: 
- io-ts.io-ts.HasProps
- io-ts.io-ts.HasPropsIntersection
*/
@js.native
trait HasPropsIntersection
  extends IntersectionType[js.Array[HasProps], Any, Any, Any]
     with _HasProps
