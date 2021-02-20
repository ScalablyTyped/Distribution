package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("knockout", "subscribable")
@js.native
class subscribable[T] () extends SubscribableFunctions[T]
object subscribable {
  
  @JSImport("knockout", "subscribable")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("knockout", "subscribable.fn")
  @js.native
  def fn: SubscribableFunctions[js.Any] = js.native
  @scala.inline
  def fn_=(x: SubscribableFunctions[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
