package typings.kyujitai

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Utility collections for making Japanese text old-fashioned.
    */
  @JSImport("kyujitai", JSImport.Namespace)
  @js.native
  class ^ () extends Kyujitai {
    def this(callback: InitializeCallback) = this()
    def this(options: Options) = this()
    def this(options: js.UndefOr[scala.Nothing], callback: InitializeCallback) = this()
    def this(options: Options, callback: InitializeCallback) = this()
  }
  
  /** unused */
  type DecodeOptions = StringDictionary[js.Any]
  
  @js.native
  trait EncodeOptions extends StObject {
    
    /**
      * `true` if you want to allow IVS for the encoded string
      * @default false
      */
    var IVD: js.UndefOr[Boolean] = js.native
  }
  object EncodeOptions {
    
    @scala.inline
    def apply(): EncodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodeOptions]
    }
    
    @scala.inline
    implicit class EncodeOptionsMutableBuilder[Self <: EncodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIVD(value: Boolean): Self = StObject.set(x, "IVD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIVDUndefined: Self = StObject.set(x, "IVD", js.undefined)
    }
  }
  
  /**
    * Called when construction completed
    */
  type InitializeCallback = js.Function1[/* error */ Error | Null, Unit]
  
  /**
    * Utility collections for making Japanese text old-fashioned.
    */
  @js.native
  trait Kyujitai extends StObject {
    
    /**
      * Decode string from kyujitai to shinjitai.
      */
    def decode(str: String): String = js.native
    def decode(str: String, options: DecodeOptions): String = js.native
    
    /**
      * Encode string from shinjitai to kyujitai.
      * @param str Input string
      * @param [options]
      */
    def encode(str: String): String = js.native
    def encode(str: String, options: EncodeOptions): String = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * the path to ivd.json file.
      * Valid only in browser.
      * Default is the same directory to the ivs.js file.
      */
    var ivd: js.UndefOr[String] = js.native
    
    var kyujitai: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIvd(value: String): Self = StObject.set(x, "ivd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIvdUndefined: Self = StObject.set(x, "ivd", js.undefined)
      
      @scala.inline
      def setKyujitai(value: String): Self = StObject.set(x, "kyujitai", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKyujitaiUndefined: Self = StObject.set(x, "kyujitai", js.undefined)
    }
  }
}
