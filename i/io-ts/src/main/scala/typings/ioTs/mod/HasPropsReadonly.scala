package typings.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type HasPropsReadonly = io-ts.io-ts.ReadonlyType<io-ts.io-ts.HasProps, any, any, any>
}}}
to avoid circular code involving: 
- io-ts.io-ts.HasProps
- io-ts.io-ts.HasPropsIntersection
- io-ts.io-ts.HasPropsReadonly
*/
@js.native
trait HasPropsReadonly
  extends ReadonlyType[HasProps, Any, Any, Any]
     with _HasProps
