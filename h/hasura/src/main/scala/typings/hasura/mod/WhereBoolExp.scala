package typings.hasura.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhereBoolExp[T /* <: Record[String, Any] */] extends StObject {
  
  var _and: js.UndefOr[js.Array[WhereBoolExp[T]]] = js.native
  
  var _not: js.UndefOr[js.Array[WhereBoolExp[T]]] = js.native
  
  var _or: js.UndefOr[js.Array[WhereBoolExp[T]]] = js.native
}
