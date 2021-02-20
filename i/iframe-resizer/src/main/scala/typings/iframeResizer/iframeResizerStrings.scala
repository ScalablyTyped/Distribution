package typings.iframeResizer

import typings.iframeResizer.mod.HeightCalculationMethod
import typings.iframeResizer.mod.WidthCalculationMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iframeResizerStrings {
  
  @js.native
  sealed trait auto extends StObject
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait bodyOffset
    extends HeightCalculationMethod
       with WidthCalculationMethod
  @scala.inline
  def bodyOffset: bodyOffset = "bodyOffset".asInstanceOf[bodyOffset]
  
  @js.native
  sealed trait bodyScroll
    extends HeightCalculationMethod
       with WidthCalculationMethod
  @scala.inline
  def bodyScroll: bodyScroll = "bodyScroll".asInstanceOf[bodyScroll]
  
  @js.native
  sealed trait child extends StObject
  @scala.inline
  def child: child = "child".asInstanceOf[child]
  
  @js.native
  sealed trait documentElementOffset
    extends HeightCalculationMethod
       with WidthCalculationMethod
  @scala.inline
  def documentElementOffset: documentElementOffset = "documentElementOffset".asInstanceOf[documentElementOffset]
  
  @js.native
  sealed trait documentElementScroll
    extends HeightCalculationMethod
       with WidthCalculationMethod
  @scala.inline
  def documentElementScroll: documentElementScroll = "documentElementScroll".asInstanceOf[documentElementScroll]
  
  @js.native
  sealed trait grow extends HeightCalculationMethod
  @scala.inline
  def grow: grow = "grow".asInstanceOf[grow]
  
  @js.native
  sealed trait lowestElement extends HeightCalculationMethod
  @scala.inline
  def lowestElement: lowestElement = "lowestElement".asInstanceOf[lowestElement]
  
  @js.native
  sealed trait max
    extends HeightCalculationMethod
       with WidthCalculationMethod
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  
  @js.native
  sealed trait min
    extends HeightCalculationMethod
       with WidthCalculationMethod
  @scala.inline
  def min: min = "min".asInstanceOf[min]
  
  @js.native
  sealed trait parent extends StObject
  @scala.inline
  def parent: parent = "parent".asInstanceOf[parent]
  
  @js.native
  sealed trait rightMostElement extends WidthCalculationMethod
  @scala.inline
  def rightMostElement: rightMostElement = "rightMostElement".asInstanceOf[rightMostElement]
  
  @js.native
  sealed trait scroll extends WidthCalculationMethod
  @scala.inline
  def scroll: scroll = "scroll".asInstanceOf[scroll]
  
  @js.native
  sealed trait taggedElement
    extends HeightCalculationMethod
       with WidthCalculationMethod
  @scala.inline
  def taggedElement: taggedElement = "taggedElement".asInstanceOf[taggedElement]
}
