package typings.ivViewer

import typings.ivViewer.mod.IVImage
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Container extends StObject {
    
    var container: Element | Null
    
    var domElement: Element | Null
    
    var hiResImageSrc: IVImage
    
    var imageSrc: IVImage
  }
  object Container {
    
    @scala.inline
    def apply(): Container = {
      val __obj = js.Dynamic.literal(container = null, domElement = null, hiResImageSrc = null, imageSrc = null)
      __obj.asInstanceOf[Container]
    }
    
    @scala.inline
    implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerNull: Self = StObject.set(x, "container", null)
      
      @scala.inline
      def setDomElement(value: Element): Self = StObject.set(x, "domElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomElementNull: Self = StObject.set(x, "domElement", null)
      
      @scala.inline
      def setHiResImageSrc(value: IVImage): Self = StObject.set(x, "hiResImageSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiResImageSrcNull: Self = StObject.set(x, "hiResImageSrc", null)
      
      @scala.inline
      def setImageSrc(value: IVImage): Self = StObject.set(x, "imageSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSrcNull: Self = StObject.set(x, "imageSrc", null)
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
