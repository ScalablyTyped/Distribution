package typings.looksSame

import typings.looksSame.anon.Tolerance
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Compare two images
    * @param image1 The first image
    * @param image2 The second image
    * @param callback Call when finish compare
    */
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: String, image2: String, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: String, image2: String, options: js.Object, callback: LooksSameCallback): Unit = js.native
  /**
    * Compare two images with options
    * @param image1 The first image
    * @param image2 The second image
    * @param options The options passed to looksSame function
    * @param callback Call when finish compare
    */
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: String, image2: String, options: LooksSameOptions, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: String, image2: BoundedImage, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: String, image2: BoundedImage, options: js.Object, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: String, image2: BoundedImage, options: LooksSameOptions, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: String, image2: Buffer, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: String, image2: Buffer, options: js.Object, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: String, image2: Buffer, options: LooksSameOptions, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: BoundedImage, image2: String, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: BoundedImage, image2: String, options: js.Object, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: BoundedImage, image2: String, options: LooksSameOptions, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: BoundedImage, image2: BoundedImage, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: BoundedImage, image2: BoundedImage, options: js.Object, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: BoundedImage, image2: BoundedImage, options: LooksSameOptions, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: BoundedImage, image2: Buffer, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: BoundedImage, image2: Buffer, options: js.Object, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: BoundedImage, image2: Buffer, options: LooksSameOptions, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: Buffer, image2: String, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: Buffer, image2: String, options: js.Object, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: Buffer, image2: String, options: LooksSameOptions, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: Buffer, image2: BoundedImage, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: Buffer, image2: BoundedImage, options: js.Object, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: Buffer, image2: BoundedImage, options: LooksSameOptions, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: Buffer, image2: Buffer, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: Buffer, image2: Buffer, options: js.Object, callback: LooksSameCallback): Unit = js.native
  @JSImport("looks-same", JSImport.Namespace)
  @js.native
  def apply(image1: Buffer, image2: Buffer, options: LooksSameOptions, callback: LooksSameCallback): Unit = js.native
  
  @JSImport("looks-same", "colors")
  @js.native
  def colors(color1: Color, color2: Color, options: Tolerance): Unit = js.native
  
  @JSImport("looks-same", "createDiff")
  @js.native
  def createDiff(
    options: CreateDiffAsBufferOptions,
    callback: js.Function2[/* error */ Error | Null, /* buffer */ Buffer, _]
  ): Unit = js.native
  @JSImport("looks-same", "createDiff")
  @js.native
  def createDiff(options: CreateDiffOptions, callback: js.Function1[/* error */ Error | Null, _]): Unit = js.native
  
  /**
    * bounded image
    */
  @js.native
  trait BoundedImage extends StObject {
    
    /**
      * bounding coordinates
      */
    var boundingBox: CoordBounds = js.native
    
    /**
      * image path or buffer
      */
    var source: String | Buffer = js.native
  }
  object BoundedImage {
    
    @scala.inline
    def apply(boundingBox: CoordBounds, source: String | Buffer): BoundedImage = {
      val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundedImage]
    }
    
    @scala.inline
    implicit class BoundedImageMutableBuilder[Self <: BoundedImage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundingBox(value: CoordBounds): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String | Buffer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Pass to looksSame.colors function
    */
  @js.native
  trait Color extends StObject {
    
    /**
      * Blue
      */
    var B: Double = js.native
    
    /**
      * Green
      */
    var G: Double = js.native
    
    /**
      * Red
      */
    var R: Double = js.native
  }
  object Color {
    
    @scala.inline
    def apply(B: Double, G: Double, R: Double): Color = {
      val __obj = js.Dynamic.literal(B = B.asInstanceOf[js.Any], G = G.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "G", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * coordinate bounds
    */
  @js.native
  trait CoordBounds extends StObject {
    
    /**
      * Y-coordinate of bottom right corner
      */
    var bottom: Double = js.native
    
    /**
      * X-coordinate of upper left corner
      */
    var left: Double = js.native
    
    /**
      * X-coordinate of bottom right corner
      */
    var right: Double = js.native
    
    /**
      * Y-coordinate of upper left corner
      */
    var top: Double = js.native
  }
  object CoordBounds {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): CoordBounds = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoordBounds]
    }
    
    @scala.inline
    implicit class CoordBoundsMutableBuilder[Self <: CoordBounds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The options passed to looksSame.createDiff function without diff
    */
  @js.native
  trait CreateDiffAsBufferOptions extends StObject {
    
    /**
      * makes the search algorithm of the antialiasing less strict
      */
    var antialiasingTolerance: js.UndefOr[Double] = js.native
    
    /**
      * The current image
      */
    var current: String | Buffer | BoundedImage = js.native
    
    /**
      * Color to highlight the differences
      * e.g. '#ff00ff'
      */
    var highlightColor: String = js.native
    
    /**
      * Ability to ignore antialiasing
      */
    var ignoreAntialiasing: js.UndefOr[Boolean] = js.native
    
    /**
      * Ability to ignore text caret
      */
    var ignoreCaret: js.UndefOr[Boolean] = js.native
    
    /**
      * The baseline image
      */
    var reference: String | Buffer | BoundedImage = js.native
    
    /**
      * strict comparsion
      */
    var strict: js.UndefOr[Boolean] = js.native
    
    /**
      * ΔE value that will be treated as error in non-strict mode
      */
    var tolerance: js.UndefOr[Double] = js.native
  }
  object CreateDiffAsBufferOptions {
    
    @scala.inline
    def apply(
      current: String | Buffer | BoundedImage,
      highlightColor: String,
      reference: String | Buffer | BoundedImage
    ): CreateDiffAsBufferOptions = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], highlightColor = highlightColor.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateDiffAsBufferOptions]
    }
    
    @scala.inline
    implicit class CreateDiffAsBufferOptionsMutableBuilder[Self <: CreateDiffAsBufferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAntialiasingTolerance(value: Double): Self = StObject.set(x, "antialiasingTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAntialiasingToleranceUndefined: Self = StObject.set(x, "antialiasingTolerance", js.undefined)
      
      @scala.inline
      def setCurrent(value: String | Buffer | BoundedImage): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightColor(value: String): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreAntialiasing(value: Boolean): Self = StObject.set(x, "ignoreAntialiasing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreAntialiasingUndefined: Self = StObject.set(x, "ignoreAntialiasing", js.undefined)
      
      @scala.inline
      def setIgnoreCaret(value: Boolean): Self = StObject.set(x, "ignoreCaret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCaretUndefined: Self = StObject.set(x, "ignoreCaret", js.undefined)
      
      @scala.inline
      def setReference(value: String | Buffer | BoundedImage): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    }
  }
  
  /**
    * The options passed to looksSame.createDiff function
    */
  @js.native
  trait CreateDiffOptions extends CreateDiffAsBufferOptions {
    
    /**
      * The diff image path to store
      */
    var diff: String = js.native
  }
  object CreateDiffOptions {
    
    @scala.inline
    def apply(
      current: String | Buffer | BoundedImage,
      diff: String,
      highlightColor: String,
      reference: String | Buffer | BoundedImage
    ): CreateDiffOptions = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], highlightColor = highlightColor.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateDiffOptions]
    }
    
    @scala.inline
    implicit class CreateDiffOptionsMutableBuilder[Self <: CreateDiffOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiff(value: String): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
    }
  }
  
  type LooksSameCallback = js.Function2[/* error */ Error | Null, /* result */ LooksSameResult, Unit]
  
  /**
    * The options passed to looksSame function
    */
  @js.native
  trait LooksSameOptions extends StObject {
    
    /**
      * Sometimes the antialiasing algorithm can work incorrectly due to some features of the browser rendering engine.
      * Use the option antialiasingTolerance to make the algorithm less strict.
      * With this option you can specify the minimum difference in brightness (zero by default)
      * between the darkest/lightest pixel (which is adjacent to the antialiasing pixel) and theirs adjacent pixels.
      *
      * We recommend that you don't increase this value above 10. If you need to increase more than 10 then this is definitely not antialiasing.
      */
    var antialiasingTolerance: js.UndefOr[Double] = js.native
    
    /**
      * Radius for every diff cluster
      */
    var clustersSize: js.UndefOr[Double] = js.native
    
    /**
      * Some images has difference while comparing because of antialiasing.
      * These diffs will be ignored by default. You can use ignoreAntialiasing option with false value to disable ignoring such diffs.
      * In that way antialiased pixels will be marked as diffs.
      */
    var ignoreAntialiasing: js.UndefOr[Boolean] = js.native
    
    /**
      * Text caret in text input elements it is a pain for visual regression tasks, because it is always blinks.
      * These diffs will be ignored by default. You can use `ignoreCaret` option with `false` value to disable ignoring such diffs.
      * In that way text caret will be marked as diffs.
      */
    var ignoreCaret: js.UndefOr[Boolean] = js.native
    
    /**
      * Some devices can have different proportion between physical and logical screen resolutions also known as pixel ratio.
      * Default value for this proportion is 1.
      * This param also affects the comparison result, so it can be set manually with pixelRatio option.
      */
    var pixelRatio: js.UndefOr[Double] = js.native
    
    /**
      * Responsible for diff bounds clustering
      */
    var shouldCluster: js.UndefOr[Boolean] = js.native
    
    /**
      * Responsible for diff area which will be returned  when comparing images.
      * Diff bounds will contain the whole diff if stopOnFirstFail is false and only first diff pixel - otherwise.
      */
    var stopOnFirstFail: js.UndefOr[Boolean] = js.native
    
    /**
      * By default, it will detect only noticeable differences. If you wish to detect any difference, use strict options.
      */
    var strict: js.UndefOr[Boolean] = js.native
    
    /**
      * You can also adjust the ΔE value that will be treated as error in non-strict mode.
      */
    var tolerance: js.UndefOr[Double] = js.native
  }
  object LooksSameOptions {
    
    @scala.inline
    def apply(): LooksSameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LooksSameOptions]
    }
    
    @scala.inline
    implicit class LooksSameOptionsMutableBuilder[Self <: LooksSameOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAntialiasingTolerance(value: Double): Self = StObject.set(x, "antialiasingTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAntialiasingToleranceUndefined: Self = StObject.set(x, "antialiasingTolerance", js.undefined)
      
      @scala.inline
      def setClustersSize(value: Double): Self = StObject.set(x, "clustersSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClustersSizeUndefined: Self = StObject.set(x, "clustersSize", js.undefined)
      
      @scala.inline
      def setIgnoreAntialiasing(value: Boolean): Self = StObject.set(x, "ignoreAntialiasing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreAntialiasingUndefined: Self = StObject.set(x, "ignoreAntialiasing", js.undefined)
      
      @scala.inline
      def setIgnoreCaret(value: Boolean): Self = StObject.set(x, "ignoreCaret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCaretUndefined: Self = StObject.set(x, "ignoreCaret", js.undefined)
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      @scala.inline
      def setShouldCluster(value: Boolean): Self = StObject.set(x, "shouldCluster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldClusterUndefined: Self = StObject.set(x, "shouldCluster", js.undefined)
      
      @scala.inline
      def setStopOnFirstFail(value: Boolean): Self = StObject.set(x, "stopOnFirstFail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopOnFirstFailUndefined: Self = StObject.set(x, "stopOnFirstFail", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    }
  }
  
  /**
    * The result obtained from the function.
  */
  @js.native
  trait LooksSameResult extends StObject {
    
    /**
      * diff bounds for not equal images
      */
    var diffBounds: js.UndefOr[CoordBounds] = js.native
    
    /**
      * diff clusters for not equal images
      */
    var diffClusters: js.UndefOr[js.Array[CoordBounds]] = js.native
    
    /**
      * true if images are equal, false - otherwise
      */
    var equal: js.UndefOr[Boolean] = js.native
  }
  object LooksSameResult {
    
    @scala.inline
    def apply(): LooksSameResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LooksSameResult]
    }
    
    @scala.inline
    implicit class LooksSameResultMutableBuilder[Self <: LooksSameResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiffBounds(value: CoordBounds): Self = StObject.set(x, "diffBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiffBoundsUndefined: Self = StObject.set(x, "diffBounds", js.undefined)
      
      @scala.inline
      def setDiffClusters(value: js.Array[CoordBounds]): Self = StObject.set(x, "diffClusters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiffClustersUndefined: Self = StObject.set(x, "diffClusters", js.undefined)
      
      @scala.inline
      def setDiffClustersVarargs(value: CoordBounds*): Self = StObject.set(x, "diffClusters", js.Array(value :_*))
      
      @scala.inline
      def setEqual(value: Boolean): Self = StObject.set(x, "equal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEqualUndefined: Self = StObject.set(x, "equal", js.undefined)
    }
  }
}
