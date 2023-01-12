package typings.karmaImageSnapshot

import typings.karmaImageSnapshot.karmaImageSnapshotBooleans.`false`
import typings.karmaImageSnapshot.karmaImageSnapshotStrings.bezkrovny
import typings.karmaImageSnapshot.karmaImageSnapshotStrings.fast
import typings.karmaImageSnapshot.karmaImageSnapshotStrings.integer
import typings.karmaImageSnapshot.karmaImageSnapshotStrings.original
import typings.karmaImageSnapshot.karmaImageSnapshotStrings.weber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Counter extends StObject {
    
    var counter: Double
    
    var currentTestName: String
    
    var defaultIdentifier: String
    
    var testPath: String
  }
  object Counter {
    
    inline def apply(counter: Double, currentTestName: String, defaultIdentifier: String, testPath: String): Counter = {
      val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], currentTestName = currentTestName.asInstanceOf[js.Any], defaultIdentifier = defaultIdentifier.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Counter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Counter] (val x: Self) extends AnyVal {
      
      inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setCurrentTestName(value: String): Self = StObject.set(x, "currentTestName", value.asInstanceOf[js.Any])
      
      inline def setDefaultIdentifier(value: String): Self = StObject.set(x, "defaultIdentifier", value.asInstanceOf[js.Any])
      
      inline def setTestPath(value: String): Self = StObject.set(x, "testPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<ssim.js.ssim.js.Options> */
  trait PartialOptions extends StObject {
    
    var bitDepth: js.UndefOr[Double] = js.undefined
    
    var downsample: js.UndefOr[original | fast | `false`] = js.undefined
    
    var k1: js.UndefOr[Double] = js.undefined
    
    var k2: js.UndefOr[Double] = js.undefined
    
    var maxSize: js.UndefOr[Double] = js.undefined
    
    var rgb2grayVersion: js.UndefOr[original | integer] = js.undefined
    
    var ssim: js.UndefOr[fast | original | bezkrovny | weber] = js.undefined
    
    var windowSize: js.UndefOr[Double] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      inline def setBitDepth(value: Double): Self = StObject.set(x, "bitDepth", value.asInstanceOf[js.Any])
      
      inline def setBitDepthUndefined: Self = StObject.set(x, "bitDepth", js.undefined)
      
      inline def setDownsample(value: original | fast | `false`): Self = StObject.set(x, "downsample", value.asInstanceOf[js.Any])
      
      inline def setDownsampleUndefined: Self = StObject.set(x, "downsample", js.undefined)
      
      inline def setK1(value: Double): Self = StObject.set(x, "k1", value.asInstanceOf[js.Any])
      
      inline def setK1Undefined: Self = StObject.set(x, "k1", js.undefined)
      
      inline def setK2(value: Double): Self = StObject.set(x, "k2", value.asInstanceOf[js.Any])
      
      inline def setK2Undefined: Self = StObject.set(x, "k2", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setRgb2grayVersion(value: original | integer): Self = StObject.set(x, "rgb2grayVersion", value.asInstanceOf[js.Any])
      
      inline def setRgb2grayVersionUndefined: Self = StObject.set(x, "rgb2grayVersion", js.undefined)
      
      inline def setSsim(value: fast | original | bezkrovny | weber): Self = StObject.set(x, "ssim", value.asInstanceOf[js.Any])
      
      inline def setSsimUndefined: Self = StObject.set(x, "ssim", js.undefined)
      
      inline def setWindowSize(value: Double): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
      
      inline def setWindowSizeUndefined: Self = StObject.set(x, "windowSize", js.undefined)
    }
  }
}
