package typings.iframeDashResizer

import typings.iframeDashResizer.iframeDashResizerMod.HeightCalculationMethod
import typings.iframeDashResizer.iframeDashResizerMod.WidthCalculationMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object iframeDashResizerStrings {
  @js.native
  sealed trait auto extends js.Object
  
  @js.native
  sealed trait bodyOffset
    extends HeightCalculationMethod
       with WidthCalculationMethod
  
  @js.native
  sealed trait bodyScroll
    extends HeightCalculationMethod
       with WidthCalculationMethod
  
  @js.native
  sealed trait child extends js.Object
  
  @js.native
  sealed trait documentElementOffset
    extends HeightCalculationMethod
       with WidthCalculationMethod
  
  @js.native
  sealed trait documentElementScroll
    extends HeightCalculationMethod
       with WidthCalculationMethod
  
  @js.native
  sealed trait grow extends HeightCalculationMethod
  
  @js.native
  sealed trait lowestElement extends HeightCalculationMethod
  
  @js.native
  sealed trait max
    extends HeightCalculationMethod
       with WidthCalculationMethod
  
  @js.native
  sealed trait min
    extends HeightCalculationMethod
       with WidthCalculationMethod
  
  @js.native
  sealed trait parent extends js.Object
  
  @js.native
  sealed trait rightMostElement extends WidthCalculationMethod
  
  @js.native
  sealed trait scroll extends WidthCalculationMethod
  
  @js.native
  sealed trait taggedElement
    extends HeightCalculationMethod
       with WidthCalculationMethod
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def bodyOffset: bodyOffset = "bodyOffset".asInstanceOf[bodyOffset]
  @scala.inline
  def bodyScroll: bodyScroll = "bodyScroll".asInstanceOf[bodyScroll]
  @scala.inline
  def child: child = "child".asInstanceOf[child]
  @scala.inline
  def documentElementOffset: documentElementOffset = "documentElementOffset".asInstanceOf[documentElementOffset]
  @scala.inline
  def documentElementScroll: documentElementScroll = "documentElementScroll".asInstanceOf[documentElementScroll]
  @scala.inline
  def grow: grow = "grow".asInstanceOf[grow]
  @scala.inline
  def lowestElement: lowestElement = "lowestElement".asInstanceOf[lowestElement]
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  @scala.inline
  def min: min = "min".asInstanceOf[min]
  @scala.inline
  def parent: parent = "parent".asInstanceOf[parent]
  @scala.inline
  def rightMostElement: rightMostElement = "rightMostElement".asInstanceOf[rightMostElement]
  @scala.inline
  def scroll: scroll = "scroll".asInstanceOf[scroll]
  @scala.inline
  def taggedElement: taggedElement = "taggedElement".asInstanceOf[taggedElement]
}

