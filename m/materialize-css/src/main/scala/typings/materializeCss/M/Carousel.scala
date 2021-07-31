package typings.materializeCss.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<CarouselOptions> * / any */ @js.native
trait Carousel extends StObject {
  
  /**
    * The index of the center carousel item
    */
  var center: Double = js.native
  
  /**
    * If the carousel is currently being dragged
    */
  var dragged: Double = js.native
  
  /**
    * Move carousel to next slide or go forward a given amount of slides
    * @param n How many times the carousel slides
    */
  def next(): Unit = js.native
  def next(n: Double): Unit = js.native
  
  /**
    * If the carousel is being clicked or tapped
    */
  var pressed: Boolean = js.native
  
  /**
    * Move carousel to previous slide or go back a given amount of slides
    * @param n How many times the carousel slides
    */
  def prev(): Unit = js.native
  def prev(n: Double): Unit = js.native
  
  /**
    * Move carousel to nth slide
    * @param n Index of slide
    */
  def set(): Unit = js.native
  def set(n: Double): Unit = js.native
}
