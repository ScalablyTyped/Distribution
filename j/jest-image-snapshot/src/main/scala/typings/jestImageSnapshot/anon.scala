package typings.jestImageSnapshot

import typings.jestImageSnapshot.jestImageSnapshotBooleans.`false`
import typings.jestImageSnapshot.jestImageSnapshotStrings.bezkrovny
import typings.jestImageSnapshot.jestImageSnapshotStrings.fast
import typings.jestImageSnapshot.jestImageSnapshotStrings.integer
import typings.jestImageSnapshot.jestImageSnapshotStrings.original
import typings.jestImageSnapshot.jestImageSnapshotStrings.weber
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
    
    @scala.inline
    def apply(counter: Double, currentTestName: String, defaultIdentifier: String, testPath: String): Counter = {
      val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], currentTestName = currentTestName.asInstanceOf[js.Any], defaultIdentifier = defaultIdentifier.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Counter]
    }
    
    @scala.inline
    implicit class CounterMutableBuilder[Self <: Counter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTestName(value: String): Self = StObject.set(x, "currentTestName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultIdentifier(value: String): Self = StObject.set(x, "defaultIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestPath(value: String): Self = StObject.set(x, "testPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    def message(): String
    
    var pass: Boolean
  }
  object Message {
    
    @scala.inline
    def apply(message: () => String, pass: Boolean): Message = {
      val __obj = js.Dynamic.literal(message = js.Any.fromFunction0(message), pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: () => String): Self = StObject.set(x, "message", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitDepth(value: Double): Self = StObject.set(x, "bitDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitDepthUndefined: Self = StObject.set(x, "bitDepth", js.undefined)
      
      @scala.inline
      def setDownsample(value: original | fast | `false`): Self = StObject.set(x, "downsample", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownsampleUndefined: Self = StObject.set(x, "downsample", js.undefined)
      
      @scala.inline
      def setK1(value: Double): Self = StObject.set(x, "k1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK1Undefined: Self = StObject.set(x, "k1", js.undefined)
      
      @scala.inline
      def setK2(value: Double): Self = StObject.set(x, "k2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK2Undefined: Self = StObject.set(x, "k2", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setRgb2grayVersion(value: original | integer): Self = StObject.set(x, "rgb2grayVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRgb2grayVersionUndefined: Self = StObject.set(x, "rgb2grayVersion", js.undefined)
      
      @scala.inline
      def setSsim(value: fast | original | bezkrovny | weber): Self = StObject.set(x, "ssim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsimUndefined: Self = StObject.set(x, "ssim", js.undefined)
      
      @scala.inline
      def setWindowSize(value: Double): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowSizeUndefined: Self = StObject.set(x, "windowSize", js.undefined)
    }
  }
}
