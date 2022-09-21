package typings.igniteUi.global.Infragistics

import typings.igniteUi.OlapResultAxisOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Infragistics.OlapResultAxis")
@js.native
open class OlapResultAxis protected ()
  extends StObject
     with typings.igniteUi.Infragistics.OlapResultAxis {
  def this(options: OlapResultAxisOptions) = this()
  
  /**
    * Returns the count of the $.ig.OlapResultAxisMember objects of each tuple.
    */
  /* CompleteClass */
  override def tupleSize(): Double = js.native
  
  /**
    * Returns an array of $.ig.OlapResultTuple objects which form the axis.
    */
  /* CompleteClass */
  override def tuples(): js.Array[Any] = js.native
}
