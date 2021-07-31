package typings.handbrakeJs

import org.scalablytyped.runtime.StringDictionary
import typings.handbrakeJs.anon.Stderr
import typings.handbrakeJs.handbrakeJsStrings.Encoding
import typings.handbrakeJs.handbrakeJsStrings.Muxing
import typings.handbrakeJs.handbrakeJsStrings.begin
import typings.handbrakeJs.handbrakeJsStrings.cancelled
import typings.handbrakeJs.handbrakeJsStrings.complete
import typings.handbrakeJs.handbrakeJsStrings.end
import typings.handbrakeJs.handbrakeJsStrings.error
import typings.handbrakeJs.handbrakeJsStrings.progress
import typings.handbrakeJs.handbrakeJsStrings.start
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("handbrake-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait HandbrakeErrors extends StObject
  @JSImport("handbrake-js", "HandbrakeErrors")
  @js.native
  object HandbrakeErrors extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[HandbrakeErrors & String] = js.native
    
    @js.native
    sealed trait INVALID_INPUT
      extends StObject
         with HandbrakeErrors
    /* "InvalidInput" */ val INVALID_INPUT: typings.handbrakeJs.mod.HandbrakeErrors.INVALID_INPUT & String = js.native
    
    @js.native
    sealed trait INVALID_PRESET
      extends StObject
         with HandbrakeErrors
    /* "InvalidPreset" */ val INVALID_PRESET: typings.handbrakeJs.mod.HandbrakeErrors.INVALID_PRESET & String = js.native
    
    @js.native
    sealed trait NOT_FOUND
      extends StObject
         with HandbrakeErrors
    /* "HandbrakeCLINotFound" */ val NOT_FOUND: typings.handbrakeJs.mod.HandbrakeErrors.NOT_FOUND & String = js.native
    
    @js.native
    sealed trait OTHER
      extends StObject
         with HandbrakeErrors
    /* "Other" */ val OTHER: typings.handbrakeJs.mod.HandbrakeErrors.OTHER & String = js.native
    
    @js.native
    sealed trait VALIDATION
      extends StObject
         with HandbrakeErrors
    /* "ValidationError" */ val VALIDATION: typings.handbrakeJs.mod.HandbrakeErrors.VALIDATION & String = js.native
  }
  
  @scala.inline
  def exec(options: HandbrakeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def exec(
    options: HandbrakeOptions,
    cb: js.Function3[/* err */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def run(options: HandbrakeOptions): js.Promise[Stderr] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stderr]]
  
  @scala.inline
  def spawn(options: HandbrakeOptions): Handbrake = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(options.asInstanceOf[js.Any]).asInstanceOf[Handbrake]
  
  @js.native
  trait Handbrake extends EventEmitter {
    
    def cancel(): Unit = js.native
    
    val eError: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HandbrakeErrors */ js.Any = js.native
    
    @JSName("on")
    def on_begin(event: begin, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_cancelled(event: cancelled, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_complete(event: complete, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, cb: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_output(event: typings.handbrakeJs.handbrakeJsStrings.output, cb: js.Function1[/* output */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_progress(event: progress, cb: js.Function1[/* progress */ HandbrakeProgress, Unit]): this.type = js.native
    @JSName("on")
    def on_start(event: start, cb: js.Function0[Unit]): this.type = js.native
    
    val options: HandbrakeOptions = js.native
    
    val output: String = js.native
  }
  
  trait HandbrakeOptions
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var A: js.UndefOr[String] = js.undefined
    
    var B: js.UndefOr[String] = js.undefined
    
    var C: js.UndefOr[String] = js.undefined
    
    var D: js.UndefOr[Double] = js.undefined
    
    var E: js.UndefOr[String] = js.undefined
    
    var F: js.UndefOr[Double] = js.undefined
    
    var I: js.UndefOr[Boolean] = js.undefined
    
    var M: js.UndefOr[String] = js.undefined
    
    var N: js.UndefOr[String] = js.undefined
    
    var O: js.UndefOr[Boolean] = js.undefined
    
    var P: js.UndefOr[Boolean] = js.undefined
    
    var Q: js.UndefOr[String] = js.undefined
    
    var R: js.UndefOr[String] = js.undefined
    
    var T: js.UndefOr[Boolean] = js.undefined
    
    var X: js.UndefOr[Double] = js.undefined
    
    var Y: js.UndefOr[Double] = js.undefined
    
    var Z: js.UndefOr[String] = js.undefined
    
    var a: js.UndefOr[String] = js.undefined
    
    var ab: js.UndefOr[String] = js.undefined
    
    // Alias for 'aq'
    var ac: js.UndefOr[String] = js.undefined
    
    var adither: js.UndefOr[String] = js.undefined
    
    // Alias for 'audio'
    var aencoder: js.UndefOr[String] = js.undefined
    
    var `all-audio`: js.UndefOr[Boolean] = js.undefined
    
    var `all-subtitles`: js.UndefOr[Boolean] = js.undefined
    
    var aname: js.UndefOr[String] = js.undefined
    
    // Alias for 'chapters'
    var angle: js.UndefOr[Double] = js.undefined
    
    // Alias for 'ab'
    var aq: js.UndefOr[String] = js.undefined
    
    var arate: js.UndefOr[String] = js.undefined
    
    var audio: js.UndefOr[String] = js.undefined
    
    // Alias for 'aencoder'
    var `audio-copy-mask`: js.UndefOr[String] = js.undefined
    
    var `audio-fallback`: js.UndefOr[String] = js.undefined
    
    // Audio
    var `audio-lang-list`: js.UndefOr[String] = js.undefined
    
    var `auto-anamorphic`: js.UndefOr[Boolean] = js.undefined
    
    var b: js.UndefOr[Double] = js.undefined
    
    var c: js.UndefOr[String] = js.undefined
    
    var cfr: js.UndefOr[Boolean] = js.undefined
    
    var chapters: js.UndefOr[String] = js.undefined
    
    var `color-matrix`: js.UndefOr[String] = js.undefined
    
    // Alias for 'color-matrix'
    // Filters
    var `comb-detect`: js.UndefOr[String] = js.undefined
    
    // Alias for 'height'
    var crop: js.UndefOr[String] = js.undefined
    
    var `custom-anamorphic`: js.UndefOr[Boolean] = js.undefined
    
    var d: js.UndefOr[String] = js.undefined
    
    var deblock: js.UndefOr[String] = js.undefined
    
    var decomb: js.UndefOr[String] = js.undefined
    
    var deinterlace: js.UndefOr[String] = js.undefined
    
    var denoise: js.UndefOr[String] = js.undefined
    
    var detelecine: js.UndefOr[String] = js.undefined
    
    var `display-width`: js.UndefOr[Double] = js.undefined
    
    // Alias for 'arate'
    var drc: js.UndefOr[Double] = js.undefined
    
    var e: js.UndefOr[String] = js.undefined
    
    // Alias for 'use-opencl'
    // Video
    var encoder: js.UndefOr[String] = js.undefined
    
    var `encoder-level`: js.UndefOr[String] = js.undefined
    
    var `encoder-level-list`: js.UndefOr[String] = js.undefined
    
    // Alias for 'encoder'
    var `encoder-preset`: js.UndefOr[String] = js.undefined
    
    var `encoder-preset-list`: js.UndefOr[String] = js.undefined
    
    // Alias for 'encopts'
    var `encoder-profile`: js.UndefOr[String] = js.undefined
    
    var `encoder-profile-list`: js.UndefOr[String] = js.undefined
    
    var `encoder-tune`: js.UndefOr[String] = js.undefined
    
    var `encoder-tune-list`: js.UndefOr[String] = js.undefined
    
    var encopts: js.UndefOr[String] = js.undefined
    
    var f: js.UndefOr[String] = js.undefined
    
    var `first-audio`: js.UndefOr[Boolean] = js.undefined
    
    var `first-subtitles`: js.UndefOr[Boolean] = js.undefined
    
    // Alias for 'output'
    var format: js.UndefOr[String] = js.undefined
    
    var g: js.UndefOr[Boolean] = js.undefined
    
    // Alias for 'drc'
    var gain: js.UndefOr[Double] = js.undefined
    
    var grayscale: js.UndefOr[Boolean] = js.undefined
    
    var h: js.UndefOr[Boolean] = js.undefined
    
    // Alias for 'width'
    var height: js.UndefOr[Double] = js.undefined
    
    // General
    var help: js.UndefOr[Boolean] = js.undefined
    
    var hqdn3d: js.UndefOr[String] = js.undefined
    
    var i: js.UndefOr[String] = js.undefined
    
    // Source
    var input: js.UndefOr[String] = js.undefined
    
    // Alias for 'optimize'
    var `ipod-atom`: js.UndefOr[Boolean] = js.undefined
    
    var `itu-par`: js.UndefOr[Boolean] = js.undefined
    
    var `keep-display-aspect`: js.UndefOr[Boolean] = js.undefined
    
    var l: js.UndefOr[Double] = js.undefined
    
    var `loose-anamorphic`: js.UndefOr[Boolean] = js.undefined
    
    var `loose-crop`: js.UndefOr[Boolean] = js.undefined
    
    var m: js.UndefOr[Boolean] = js.undefined
    
    var `main-feature`: js.UndefOr[Boolean] = js.undefined
    
    // Alias for 'format'
    var markers: js.UndefOr[Boolean] = js.undefined
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    // Alias for 'maxHeight'
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    // Alias for 'title'
    var `min-duration`: js.UndefOr[Double] = js.undefined
    
    // Alias for 'ac'
    var mixdown: js.UndefOr[String] = js.undefined
    
    var modulus: js.UndefOr[Double] = js.undefined
    
    // Alias for 'native-language'
    var `native-dub`: js.UndefOr[Boolean] = js.undefined
    
    var `native-language`: js.UndefOr[String] = js.undefined
    
    var nlmeans: js.UndefOr[String] = js.undefined
    
    var `nlmeans-tune`: js.UndefOr[String] = js.undefined
    
    var `no-comb-detect`: js.UndefOr[Boolean] = js.undefined
    
    var `no-deblock`: js.UndefOr[Boolean] = js.undefined
    
    var `no-decomb`: js.UndefOr[Boolean] = js.undefined
    
    // Alias for 'deinterlace'
    var `no-deinterlace`: js.UndefOr[Boolean] = js.undefined
    
    var `no-detelecine`: js.UndefOr[Boolean] = js.undefined
    
    var `no-dvdnav`: js.UndefOr[Boolean] = js.undefined
    
    // Alias for 'grayscale'
    var `no-grayscale`: js.UndefOr[Boolean] = js.undefined
    
    var `no-hqdn3d`: js.UndefOr[Boolean] = js.undefined
    
    // Alias for 'ipod-atom'
    var `no-ipod-atom`: js.UndefOr[Boolean] = js.undefined
    
    var `no-loose-crop`: js.UndefOr[Boolean] = js.undefined
    
    // Alias for 'markers'
    var `no-markers`: js.UndefOr[Boolean] = js.undefined
    
    var `no-nlmeans`: js.UndefOr[Boolean] = js.undefined
    
    var `no-opencl`: js.UndefOr[Boolean] = js.undefined
    
    // Alias for 'turbo'
    var `no-turbo`: js.UndefOr[Boolean] = js.undefined
    
    var `no-two-pass`: js.UndefOr[Boolean] = js.undefined
    
    // Alias for 'maxWidth'
    var `non-anamorphic`: js.UndefOr[Boolean] = js.undefined
    
    var `normalize-mix`: js.UndefOr[String] = js.undefined
    
    var o: js.UndefOr[String] = js.undefined
    
    var optimize: js.UndefOr[Boolean] = js.undefined
    
    // Destination
    var output: js.UndefOr[String] = js.undefined
    
    var pad: js.UndefOr[String] = js.undefined
    
    var pfr: js.UndefOr[Boolean] = js.undefined
    
    var `pixel-aspect`: js.UndefOr[String] = js.undefined
    
    // Alias for 'verbose'
    var preset: js.UndefOr[String] = js.undefined
    
    // Alias for 'preset-list'
    var `preset-import-file`: js.UndefOr[String] = js.undefined
    
    // Alias for 'preset'
    var `preset-list`: js.UndefOr[Boolean] = js.undefined
    
    var previews: js.UndefOr[String] = js.undefined
    
    var q: js.UndefOr[Double] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var r: js.UndefOr[Double] = js.undefined
    
    var rate: js.UndefOr[Double] = js.undefined
    
    var rotate: js.UndefOr[String] = js.undefined
    
    var s: js.UndefOr[String] = js.undefined
    
    var scan: js.UndefOr[Boolean] = js.undefined
    
    var `srt-burn`: js.UndefOr[Double] = js.undefined
    
    var `srt-codeset`: js.UndefOr[String] = js.undefined
    
    var `srt-default`: js.UndefOr[Double] = js.undefined
    
    var `srt-file`: js.UndefOr[String] = js.undefined
    
    var `srt-lang`: js.UndefOr[String] = js.undefined
    
    var `srt-offset`: js.UndefOr[String] = js.undefined
    
    var `start-at`: js.UndefOr[String] = js.undefined
    
    var `start-at-preview`: js.UndefOr[String] = js.undefined
    
    var `stop-at`: js.UndefOr[String] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    // Alias for 'subtitle-forced'
    var `subtitle-burned`: js.UndefOr[Double] = js.undefined
    
    var `subtitle-default`: js.UndefOr[Double] = js.undefined
    
    // Alias for 'subtitle'
    var `subtitle-forced`: js.UndefOr[Double] = js.undefined
    
    // Subtitle
    var `subtitle-lang-list`: js.UndefOr[String] = js.undefined
    
    var t: js.UndefOr[Double] = js.undefined
    
    // Alias for 'input'
    var title: js.UndefOr[Double] = js.undefined
    
    var turbo: js.UndefOr[Boolean] = js.undefined
    
    // Alias for 'vb'
    var `two-pass`: js.UndefOr[Boolean] = js.undefined
    
    var `use-opencl`: js.UndefOr[Boolean] = js.undefined
    
    var v: js.UndefOr[Boolean] = js.undefined
    
    // Alias for 'quality'
    var vb: js.UndefOr[Double] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    // Alias for 'help'
    var version: js.UndefOr[Boolean] = js.undefined
    
    // Alias for 'rate'
    var vfr: js.UndefOr[Boolean] = js.undefined
    
    var w: js.UndefOr[Double] = js.undefined
    
    // Alias for 'aname'
    // Picture
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[String] = js.undefined
    
    var z: js.UndefOr[Boolean] = js.undefined
  }
  object HandbrakeOptions {
    
    @scala.inline
    def apply(): HandbrakeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandbrakeOptions]
    }
    
    @scala.inline
    implicit class HandbrakeOptionsMutableBuilder[Self <: HandbrakeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: String): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAUndefined: Self = StObject.set(x, "A", js.undefined)
      
      @scala.inline
      def setAb(value: String): Self = StObject.set(x, "ab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbUndefined: Self = StObject.set(x, "ab", js.undefined)
      
      @scala.inline
      def setAc(value: String): Self = StObject.set(x, "ac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcUndefined: Self = StObject.set(x, "ac", js.undefined)
      
      @scala.inline
      def setAdither(value: String): Self = StObject.set(x, "adither", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAditherUndefined: Self = StObject.set(x, "adither", js.undefined)
      
      @scala.inline
      def setAencoder(value: String): Self = StObject.set(x, "aencoder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAencoderUndefined: Self = StObject.set(x, "aencoder", js.undefined)
      
      @scala.inline
      def `setAll-audio`(value: Boolean): Self = StObject.set(x, "all-audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAll-audioUndefined`: Self = StObject.set(x, "all-audio", js.undefined)
      
      @scala.inline
      def `setAll-subtitles`(value: Boolean): Self = StObject.set(x, "all-subtitles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAll-subtitlesUndefined`: Self = StObject.set(x, "all-subtitles", js.undefined)
      
      @scala.inline
      def setAname(value: String): Self = StObject.set(x, "aname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnameUndefined: Self = StObject.set(x, "aname", js.undefined)
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setAq(value: String): Self = StObject.set(x, "aq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAqUndefined: Self = StObject.set(x, "aq", js.undefined)
      
      @scala.inline
      def setArate(value: String): Self = StObject.set(x, "arate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArateUndefined: Self = StObject.set(x, "arate", js.undefined)
      
      @scala.inline
      def setAudio(value: String): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAudio-copy-mask`(value: String): Self = StObject.set(x, "audio-copy-mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAudio-copy-maskUndefined`: Self = StObject.set(x, "audio-copy-mask", js.undefined)
      
      @scala.inline
      def `setAudio-fallback`(value: String): Self = StObject.set(x, "audio-fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAudio-fallbackUndefined`: Self = StObject.set(x, "audio-fallback", js.undefined)
      
      @scala.inline
      def `setAudio-lang-list`(value: String): Self = StObject.set(x, "audio-lang-list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAudio-lang-listUndefined`: Self = StObject.set(x, "audio-lang-list", js.undefined)
      
      @scala.inline
      def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      @scala.inline
      def `setAuto-anamorphic`(value: Boolean): Self = StObject.set(x, "auto-anamorphic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAuto-anamorphicUndefined`: Self = StObject.set(x, "auto-anamorphic", js.undefined)
      
      @scala.inline
      def setB(value: String): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBUndefined: Self = StObject.set(x, "B", js.undefined)
      
      @scala.inline
      def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCUndefined: Self = StObject.set(x, "C", js.undefined)
      
      @scala.inline
      def setCfr(value: Boolean): Self = StObject.set(x, "cfr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCfrUndefined: Self = StObject.set(x, "cfr", js.undefined)
      
      @scala.inline
      def setChapters(value: String): Self = StObject.set(x, "chapters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChaptersUndefined: Self = StObject.set(x, "chapters", js.undefined)
      
      @scala.inline
      def `setColor-matrix`(value: String): Self = StObject.set(x, "color-matrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColor-matrixUndefined`: Self = StObject.set(x, "color-matrix", js.undefined)
      
      @scala.inline
      def `setComb-detect`(value: String): Self = StObject.set(x, "comb-detect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setComb-detectUndefined`: Self = StObject.set(x, "comb-detect", js.undefined)
      
      @scala.inline
      def setCrop(value: String): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      @scala.inline
      def `setCustom-anamorphic`(value: Boolean): Self = StObject.set(x, "custom-anamorphic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCustom-anamorphicUndefined`: Self = StObject.set(x, "custom-anamorphic", js.undefined)
      
      @scala.inline
      def setD(value: Double): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDUndefined: Self = StObject.set(x, "D", js.undefined)
      
      @scala.inline
      def setDeblock(value: String): Self = StObject.set(x, "deblock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeblockUndefined: Self = StObject.set(x, "deblock", js.undefined)
      
      @scala.inline
      def setDecomb(value: String): Self = StObject.set(x, "decomb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecombUndefined: Self = StObject.set(x, "decomb", js.undefined)
      
      @scala.inline
      def setDeinterlace(value: String): Self = StObject.set(x, "deinterlace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeinterlaceUndefined: Self = StObject.set(x, "deinterlace", js.undefined)
      
      @scala.inline
      def setDenoise(value: String): Self = StObject.set(x, "denoise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDenoiseUndefined: Self = StObject.set(x, "denoise", js.undefined)
      
      @scala.inline
      def setDetelecine(value: String): Self = StObject.set(x, "detelecine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetelecineUndefined: Self = StObject.set(x, "detelecine", js.undefined)
      
      @scala.inline
      def `setDisplay-width`(value: Double): Self = StObject.set(x, "display-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDisplay-widthUndefined`: Self = StObject.set(x, "display-width", js.undefined)
      
      @scala.inline
      def setDrc(value: Double): Self = StObject.set(x, "drc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrcUndefined: Self = StObject.set(x, "drc", js.undefined)
      
      @scala.inline
      def setE(value: String): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEUndefined: Self = StObject.set(x, "E", js.undefined)
      
      @scala.inline
      def setEncoder(value: String): Self = StObject.set(x, "encoder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setEncoder-level`(value: String): Self = StObject.set(x, "encoder-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setEncoder-level-list`(value: String): Self = StObject.set(x, "encoder-level-list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setEncoder-level-listUndefined`: Self = StObject.set(x, "encoder-level-list", js.undefined)
      
      @scala.inline
      def `setEncoder-levelUndefined`: Self = StObject.set(x, "encoder-level", js.undefined)
      
      @scala.inline
      def `setEncoder-preset`(value: String): Self = StObject.set(x, "encoder-preset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setEncoder-preset-list`(value: String): Self = StObject.set(x, "encoder-preset-list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setEncoder-preset-listUndefined`: Self = StObject.set(x, "encoder-preset-list", js.undefined)
      
      @scala.inline
      def `setEncoder-presetUndefined`: Self = StObject.set(x, "encoder-preset", js.undefined)
      
      @scala.inline
      def `setEncoder-profile`(value: String): Self = StObject.set(x, "encoder-profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setEncoder-profile-list`(value: String): Self = StObject.set(x, "encoder-profile-list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setEncoder-profile-listUndefined`: Self = StObject.set(x, "encoder-profile-list", js.undefined)
      
      @scala.inline
      def `setEncoder-profileUndefined`: Self = StObject.set(x, "encoder-profile", js.undefined)
      
      @scala.inline
      def `setEncoder-tune`(value: String): Self = StObject.set(x, "encoder-tune", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setEncoder-tune-list`(value: String): Self = StObject.set(x, "encoder-tune-list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setEncoder-tune-listUndefined`: Self = StObject.set(x, "encoder-tune-list", js.undefined)
      
      @scala.inline
      def `setEncoder-tuneUndefined`: Self = StObject.set(x, "encoder-tune", js.undefined)
      
      @scala.inline
      def setEncoderUndefined: Self = StObject.set(x, "encoder", js.undefined)
      
      @scala.inline
      def setEncopts(value: String): Self = StObject.set(x, "encopts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoptsUndefined: Self = StObject.set(x, "encopts", js.undefined)
      
      @scala.inline
      def setF(value: Double): Self = StObject.set(x, "F", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFUndefined: Self = StObject.set(x, "F", js.undefined)
      
      @scala.inline
      def `setFirst-audio`(value: Boolean): Self = StObject.set(x, "first-audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFirst-audioUndefined`: Self = StObject.set(x, "first-audio", js.undefined)
      
      @scala.inline
      def `setFirst-subtitles`(value: Boolean): Self = StObject.set(x, "first-subtitles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFirst-subtitlesUndefined`: Self = StObject.set(x, "first-subtitles", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setG(value: Boolean): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGUndefined: Self = StObject.set(x, "g", js.undefined)
      
      @scala.inline
      def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGainUndefined: Self = StObject.set(x, "gain", js.undefined)
      
      @scala.inline
      def setGrayscale(value: Boolean): Self = StObject.set(x, "grayscale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrayscaleUndefined: Self = StObject.set(x, "grayscale", js.undefined)
      
      @scala.inline
      def setH(value: Boolean): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      @scala.inline
      def setHqdn3d(value: String): Self = StObject.set(x, "hqdn3d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHqdn3dUndefined: Self = StObject.set(x, "hqdn3d", js.undefined)
      
      @scala.inline
      def setI(value: Boolean): Self = StObject.set(x, "I", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIUndefined: Self = StObject.set(x, "I", js.undefined)
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def `setIpod-atom`(value: Boolean): Self = StObject.set(x, "ipod-atom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setIpod-atomUndefined`: Self = StObject.set(x, "ipod-atom", js.undefined)
      
      @scala.inline
      def `setItu-par`(value: Boolean): Self = StObject.set(x, "itu-par", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setItu-parUndefined`: Self = StObject.set(x, "itu-par", js.undefined)
      
      @scala.inline
      def `setKeep-display-aspect`(value: Boolean): Self = StObject.set(x, "keep-display-aspect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setKeep-display-aspectUndefined`: Self = StObject.set(x, "keep-display-aspect", js.undefined)
      
      @scala.inline
      def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLUndefined: Self = StObject.set(x, "l", js.undefined)
      
      @scala.inline
      def `setLoose-anamorphic`(value: Boolean): Self = StObject.set(x, "loose-anamorphic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLoose-anamorphicUndefined`: Self = StObject.set(x, "loose-anamorphic", js.undefined)
      
      @scala.inline
      def `setLoose-crop`(value: Boolean): Self = StObject.set(x, "loose-crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLoose-cropUndefined`: Self = StObject.set(x, "loose-crop", js.undefined)
      
      @scala.inline
      def setM(value: String): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "M", js.undefined)
      
      @scala.inline
      def `setMain-feature`(value: Boolean): Self = StObject.set(x, "main-feature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMain-featureUndefined`: Self = StObject.set(x, "main-feature", js.undefined)
      
      @scala.inline
      def setMarkers(value: Boolean): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def `setMin-duration`(value: Double): Self = StObject.set(x, "min-duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMin-durationUndefined`: Self = StObject.set(x, "min-duration", js.undefined)
      
      @scala.inline
      def setMixdown(value: String): Self = StObject.set(x, "mixdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixdownUndefined: Self = StObject.set(x, "mixdown", js.undefined)
      
      @scala.inline
      def setModulus(value: Double): Self = StObject.set(x, "modulus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulusUndefined: Self = StObject.set(x, "modulus", js.undefined)
      
      @scala.inline
      def setN(value: String): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUndefined: Self = StObject.set(x, "N", js.undefined)
      
      @scala.inline
      def `setNative-dub`(value: Boolean): Self = StObject.set(x, "native-dub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNative-dubUndefined`: Self = StObject.set(x, "native-dub", js.undefined)
      
      @scala.inline
      def `setNative-language`(value: String): Self = StObject.set(x, "native-language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNative-languageUndefined`: Self = StObject.set(x, "native-language", js.undefined)
      
      @scala.inline
      def setNlmeans(value: String): Self = StObject.set(x, "nlmeans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNlmeans-tune`(value: String): Self = StObject.set(x, "nlmeans-tune", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNlmeans-tuneUndefined`: Self = StObject.set(x, "nlmeans-tune", js.undefined)
      
      @scala.inline
      def setNlmeansUndefined: Self = StObject.set(x, "nlmeans", js.undefined)
      
      @scala.inline
      def `setNo-comb-detect`(value: Boolean): Self = StObject.set(x, "no-comb-detect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-comb-detectUndefined`: Self = StObject.set(x, "no-comb-detect", js.undefined)
      
      @scala.inline
      def `setNo-deblock`(value: Boolean): Self = StObject.set(x, "no-deblock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-deblockUndefined`: Self = StObject.set(x, "no-deblock", js.undefined)
      
      @scala.inline
      def `setNo-decomb`(value: Boolean): Self = StObject.set(x, "no-decomb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-decombUndefined`: Self = StObject.set(x, "no-decomb", js.undefined)
      
      @scala.inline
      def `setNo-deinterlace`(value: Boolean): Self = StObject.set(x, "no-deinterlace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-deinterlaceUndefined`: Self = StObject.set(x, "no-deinterlace", js.undefined)
      
      @scala.inline
      def `setNo-detelecine`(value: Boolean): Self = StObject.set(x, "no-detelecine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-detelecineUndefined`: Self = StObject.set(x, "no-detelecine", js.undefined)
      
      @scala.inline
      def `setNo-dvdnav`(value: Boolean): Self = StObject.set(x, "no-dvdnav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-dvdnavUndefined`: Self = StObject.set(x, "no-dvdnav", js.undefined)
      
      @scala.inline
      def `setNo-grayscale`(value: Boolean): Self = StObject.set(x, "no-grayscale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-grayscaleUndefined`: Self = StObject.set(x, "no-grayscale", js.undefined)
      
      @scala.inline
      def `setNo-hqdn3d`(value: Boolean): Self = StObject.set(x, "no-hqdn3d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-hqdn3dUndefined`: Self = StObject.set(x, "no-hqdn3d", js.undefined)
      
      @scala.inline
      def `setNo-ipod-atom`(value: Boolean): Self = StObject.set(x, "no-ipod-atom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-ipod-atomUndefined`: Self = StObject.set(x, "no-ipod-atom", js.undefined)
      
      @scala.inline
      def `setNo-loose-crop`(value: Boolean): Self = StObject.set(x, "no-loose-crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-loose-cropUndefined`: Self = StObject.set(x, "no-loose-crop", js.undefined)
      
      @scala.inline
      def `setNo-markers`(value: Boolean): Self = StObject.set(x, "no-markers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-markersUndefined`: Self = StObject.set(x, "no-markers", js.undefined)
      
      @scala.inline
      def `setNo-nlmeans`(value: Boolean): Self = StObject.set(x, "no-nlmeans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-nlmeansUndefined`: Self = StObject.set(x, "no-nlmeans", js.undefined)
      
      @scala.inline
      def `setNo-opencl`(value: Boolean): Self = StObject.set(x, "no-opencl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-openclUndefined`: Self = StObject.set(x, "no-opencl", js.undefined)
      
      @scala.inline
      def `setNo-turbo`(value: Boolean): Self = StObject.set(x, "no-turbo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-turboUndefined`: Self = StObject.set(x, "no-turbo", js.undefined)
      
      @scala.inline
      def `setNo-two-pass`(value: Boolean): Self = StObject.set(x, "no-two-pass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-two-passUndefined`: Self = StObject.set(x, "no-two-pass", js.undefined)
      
      @scala.inline
      def `setNon-anamorphic`(value: Boolean): Self = StObject.set(x, "non-anamorphic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNon-anamorphicUndefined`: Self = StObject.set(x, "non-anamorphic", js.undefined)
      
      @scala.inline
      def `setNormalize-mix`(value: String): Self = StObject.set(x, "normalize-mix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNormalize-mixUndefined`: Self = StObject.set(x, "normalize-mix", js.undefined)
      
      @scala.inline
      def setO(value: Boolean): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOUndefined: Self = StObject.set(x, "O", js.undefined)
      
      @scala.inline
      def setOptimize(value: Boolean): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizeUndefined: Self = StObject.set(x, "optimize", js.undefined)
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setP(value: Boolean): Self = StObject.set(x, "P", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "P", js.undefined)
      
      @scala.inline
      def setPad(value: String): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      @scala.inline
      def setPfr(value: Boolean): Self = StObject.set(x, "pfr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfrUndefined: Self = StObject.set(x, "pfr", js.undefined)
      
      @scala.inline
      def `setPixel-aspect`(value: String): Self = StObject.set(x, "pixel-aspect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPixel-aspectUndefined`: Self = StObject.set(x, "pixel-aspect", js.undefined)
      
      @scala.inline
      def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPreset-import-file`(value: String): Self = StObject.set(x, "preset-import-file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPreset-import-fileUndefined`: Self = StObject.set(x, "preset-import-file", js.undefined)
      
      @scala.inline
      def `setPreset-list`(value: Boolean): Self = StObject.set(x, "preset-list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPreset-listUndefined`: Self = StObject.set(x, "preset-list", js.undefined)
      
      @scala.inline
      def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      @scala.inline
      def setPreviews(value: String): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewsUndefined: Self = StObject.set(x, "previews", js.undefined)
      
      @scala.inline
      def setQ(value: String): Self = StObject.set(x, "Q", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQUndefined: Self = StObject.set(x, "Q", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setR(value: String): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRUndefined: Self = StObject.set(x, "R", js.undefined)
      
      @scala.inline
      def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      @scala.inline
      def setRotate(value: String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      @scala.inline
      def setScan(value: Boolean): Self = StObject.set(x, "scan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScanUndefined: Self = StObject.set(x, "scan", js.undefined)
      
      @scala.inline
      def `setSrt-burn`(value: Double): Self = StObject.set(x, "srt-burn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSrt-burnUndefined`: Self = StObject.set(x, "srt-burn", js.undefined)
      
      @scala.inline
      def `setSrt-codeset`(value: String): Self = StObject.set(x, "srt-codeset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSrt-codesetUndefined`: Self = StObject.set(x, "srt-codeset", js.undefined)
      
      @scala.inline
      def `setSrt-default`(value: Double): Self = StObject.set(x, "srt-default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSrt-defaultUndefined`: Self = StObject.set(x, "srt-default", js.undefined)
      
      @scala.inline
      def `setSrt-file`(value: String): Self = StObject.set(x, "srt-file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSrt-fileUndefined`: Self = StObject.set(x, "srt-file", js.undefined)
      
      @scala.inline
      def `setSrt-lang`(value: String): Self = StObject.set(x, "srt-lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSrt-langUndefined`: Self = StObject.set(x, "srt-lang", js.undefined)
      
      @scala.inline
      def `setSrt-offset`(value: String): Self = StObject.set(x, "srt-offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSrt-offsetUndefined`: Self = StObject.set(x, "srt-offset", js.undefined)
      
      @scala.inline
      def `setStart-at`(value: String): Self = StObject.set(x, "start-at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStart-at-preview`(value: String): Self = StObject.set(x, "start-at-preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStart-at-previewUndefined`: Self = StObject.set(x, "start-at-preview", js.undefined)
      
      @scala.inline
      def `setStart-atUndefined`: Self = StObject.set(x, "start-at", js.undefined)
      
      @scala.inline
      def `setStop-at`(value: String): Self = StObject.set(x, "stop-at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStop-atUndefined`: Self = StObject.set(x, "stop-at", js.undefined)
      
      @scala.inline
      def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSubtitle-burned`(value: Double): Self = StObject.set(x, "subtitle-burned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSubtitle-burnedUndefined`: Self = StObject.set(x, "subtitle-burned", js.undefined)
      
      @scala.inline
      def `setSubtitle-default`(value: Double): Self = StObject.set(x, "subtitle-default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSubtitle-defaultUndefined`: Self = StObject.set(x, "subtitle-default", js.undefined)
      
      @scala.inline
      def `setSubtitle-forced`(value: Double): Self = StObject.set(x, "subtitle-forced", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSubtitle-forcedUndefined`: Self = StObject.set(x, "subtitle-forced", js.undefined)
      
      @scala.inline
      def `setSubtitle-lang-list`(value: String): Self = StObject.set(x, "subtitle-lang-list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSubtitle-lang-listUndefined`: Self = StObject.set(x, "subtitle-lang-list", js.undefined)
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setT(value: Boolean): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTUndefined: Self = StObject.set(x, "T", js.undefined)
      
      @scala.inline
      def setTitle(value: Double): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTurbo(value: Boolean): Self = StObject.set(x, "turbo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTurboUndefined: Self = StObject.set(x, "turbo", js.undefined)
      
      @scala.inline
      def `setTwo-pass`(value: Boolean): Self = StObject.set(x, "two-pass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTwo-passUndefined`: Self = StObject.set(x, "two-pass", js.undefined)
      
      @scala.inline
      def `setUse-opencl`(value: Boolean): Self = StObject.set(x, "use-opencl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setUse-openclUndefined`: Self = StObject.set(x, "use-opencl", js.undefined)
      
      @scala.inline
      def setV(value: Boolean): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVUndefined: Self = StObject.set(x, "v", js.undefined)
      
      @scala.inline
      def setVb(value: Double): Self = StObject.set(x, "vb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVbUndefined: Self = StObject.set(x, "vb", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      @scala.inline
      def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setVfr(value: Boolean): Self = StObject.set(x, "vfr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVfrUndefined: Self = StObject.set(x, "vfr", js.undefined)
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "X", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "Y", js.undefined)
      
      @scala.inline
      def setZ(value: String): Self = StObject.set(x, "Z", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZUndefined: Self = StObject.set(x, "Z", js.undefined)
    }
  }
  
  trait HandbrakeProgress extends StObject {
    
    val avgFps: Double
    
    val eta: String
    
    val fps: Double
    
    val percentComplete: Double
    
    val task: Encoding | Muxing
    
    val taskCount: Double
    
    val tasknumber: Double
  }
  object HandbrakeProgress {
    
    @scala.inline
    def apply(
      avgFps: Double,
      eta: String,
      fps: Double,
      percentComplete: Double,
      task: Encoding | Muxing,
      taskCount: Double,
      tasknumber: Double
    ): HandbrakeProgress = {
      val __obj = js.Dynamic.literal(avgFps = avgFps.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], fps = fps.asInstanceOf[js.Any], percentComplete = percentComplete.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], taskCount = taskCount.asInstanceOf[js.Any], tasknumber = tasknumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandbrakeProgress]
    }
    
    @scala.inline
    implicit class HandbrakeProgressMutableBuilder[Self <: HandbrakeProgress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvgFps(value: Double): Self = StObject.set(x, "avgFps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEta(value: String): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentComplete(value: Double): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTask(value: Encoding | Muxing): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskCount(value: Double): Self = StObject.set(x, "taskCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTasknumber(value: Double): Self = StObject.set(x, "tasknumber", value.asInstanceOf[js.Any])
    }
  }
}
