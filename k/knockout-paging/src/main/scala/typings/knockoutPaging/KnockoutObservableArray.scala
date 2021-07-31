package typings.knockoutPaging

import typings.knockoutPaging.anon.Paged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutObservableArray[T]
  extends StObject
     with KnockoutObservable[js.Array[T]]
     with KnockoutObservableArrayFunctions[T] {
  
  def extend(requestedExtenders: Paged): KnockoutPagedObservableArray[T] = js.native
}
