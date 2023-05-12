package typings.gulpRewriteCss

import typings.gulpRewriteCss.mod.GulpRewriteCssPathAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AdaptPath extends StObject {
    
    var adaptPath: js.UndefOr[GulpRewriteCssPathAdapter] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var destination: String
  }
  object AdaptPath {
    
    inline def apply(destination: String): AdaptPath = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdaptPath]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdaptPath] (val x: Self) extends AnyVal {
      
      inline def setAdaptPath(value: /* context */ DestinationDir => String): Self = StObject.set(x, "adaptPath", js.Any.fromFunction1(value))
      
      inline def setAdaptPathUndefined: Self = StObject.set(x, "adaptPath", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    }
  }
  
  trait DestinationDir extends StObject {
    
    var destinationDir: String
    
    var sourceDir: String
    
    var sourceFile: String
    
    var targetFile: String
  }
  object DestinationDir {
    
    inline def apply(destinationDir: String, sourceDir: String, sourceFile: String, targetFile: String): DestinationDir = {
      val __obj = js.Dynamic.literal(destinationDir = destinationDir.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], targetFile = targetFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[DestinationDir]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DestinationDir] (val x: Self) extends AnyVal {
      
      inline def setDestinationDir(value: String): Self = StObject.set(x, "destinationDir", value.asInstanceOf[js.Any])
      
      inline def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
      
      inline def setSourceFile(value: String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
      
      inline def setTargetFile(value: String): Self = StObject.set(x, "targetFile", value.asInstanceOf[js.Any])
    }
  }
}
