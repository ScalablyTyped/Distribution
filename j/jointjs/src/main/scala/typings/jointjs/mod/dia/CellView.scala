package typings.jointjs.mod.dia

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.dia.CellView.Options
import typings.jointjs.mod.mvc.ViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "dia.CellView")
@js.native
class CellView () extends CellViewGeneric[Cell] {
  def this(opt: Options[Cell]) = this()
}
object CellView {
  
  type FlagLabel = String | js.Array[String]
  
  @js.native
  trait InteractivityOptions
    extends typings.jointjs.mod.dia.ElementView.InteractivityOptions
       with typings.jointjs.mod.dia.LinkView.InteractivityOptions
  object InteractivityOptions {
    
    @scala.inline
    def apply(): InteractivityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractivityOptions]
    }
  }
  
  @js.native
  trait Options[T /* <: Cell */] extends ViewOptions[T]
  object Options {
    
    @scala.inline
    def apply[T /* <: Cell */](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
  }
  
  type PresentationAttributes = StringDictionary[FlagLabel]
}
