package typings.loaderUtils

import org.scalablytyped.runtime.StringDictionary
import typings.loaderUtils.loaderUtilsBooleans.`false`
import typings.loaderUtils.loaderUtilsBooleans.`true`
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("loader-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCurrentRequest(
    loaderContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify loader.LoaderContext */ Any
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentRequest")(loaderContext.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getHashDigest(buffer: Buffer, hashType: HashType, digestType: DigestType, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHashDigest")(buffer.asInstanceOf[js.Any], hashType.asInstanceOf[js.Any], digestType.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getOptions(
    loaderContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify loader.LoaderContext */ Any
  ): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")(loaderContext.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def getRemainingRequest(
    loaderContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify loader.LoaderContext */ Any
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRemainingRequest")(loaderContext.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def interpolateName(
    loaderContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify loader.LoaderContext */ Any,
    name: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateName")(loaderContext.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def interpolateName(
    loaderContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify loader.LoaderContext */ Any,
    name: String,
    options: Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateName")(loaderContext.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isUrlRequest(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrlRequest")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isUrlRequest(url: String, root: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUrlRequest")(url.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parseQuery(optionString: String): OptionObject = ^.asInstanceOf[js.Dynamic].applyDynamic("parseQuery")(optionString.asInstanceOf[js.Any]).asInstanceOf[OptionObject]
  
  inline def parseString(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyRequest(
    loaderContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify loader.LoaderContext */ Any,
    resource: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyRequest")(loaderContext.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def urlToRequest(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlToRequest")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def urlToRequest(url: String, root: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("urlToRequest")(url.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.loaderUtils.loaderUtilsStrings.hex
    - typings.loaderUtils.loaderUtilsStrings.base26
    - typings.loaderUtils.loaderUtilsStrings.base32
    - typings.loaderUtils.loaderUtilsStrings.base36
    - typings.loaderUtils.loaderUtilsStrings.base49
    - typings.loaderUtils.loaderUtilsStrings.base52
    - typings.loaderUtils.loaderUtilsStrings.base58
    - typings.loaderUtils.loaderUtilsStrings.base62
    - typings.loaderUtils.loaderUtilsStrings.base64
  */
  trait DigestType extends StObject
  object DigestType {
    
    inline def base26: typings.loaderUtils.loaderUtilsStrings.base26 = "base26".asInstanceOf[typings.loaderUtils.loaderUtilsStrings.base26]
    
    inline def base32: typings.loaderUtils.loaderUtilsStrings.base32 = "base32".asInstanceOf[typings.loaderUtils.loaderUtilsStrings.base32]
    
    inline def base36: typings.loaderUtils.loaderUtilsStrings.base36 = "base36".asInstanceOf[typings.loaderUtils.loaderUtilsStrings.base36]
    
    inline def base49: typings.loaderUtils.loaderUtilsStrings.base49 = "base49".asInstanceOf[typings.loaderUtils.loaderUtilsStrings.base49]
    
    inline def base52: typings.loaderUtils.loaderUtilsStrings.base52 = "base52".asInstanceOf[typings.loaderUtils.loaderUtilsStrings.base52]
    
    inline def base58: typings.loaderUtils.loaderUtilsStrings.base58 = "base58".asInstanceOf[typings.loaderUtils.loaderUtilsStrings.base58]
    
    inline def base62: typings.loaderUtils.loaderUtilsStrings.base62 = "base62".asInstanceOf[typings.loaderUtils.loaderUtilsStrings.base62]
    
    inline def base64: typings.loaderUtils.loaderUtilsStrings.base64 = "base64".asInstanceOf[typings.loaderUtils.loaderUtilsStrings.base64]
    
    inline def hex: typings.loaderUtils.loaderUtilsStrings.hex = "hex".asInstanceOf[typings.loaderUtils.loaderUtilsStrings.hex]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.loaderUtils.loaderUtilsStrings.sha1
    - typings.loaderUtils.loaderUtilsStrings.md4
    - typings.loaderUtils.loaderUtilsStrings.md5
    - typings.loaderUtils.loaderUtilsStrings.sha256
    - typings.loaderUtils.loaderUtilsStrings.sha512
  */
  trait HashType extends StObject
  object HashType {
    
    inline def md4: typings.loaderUtils.loaderUtilsStrings.md4 = "md4".asInstanceOf[typings.loaderUtils.loaderUtilsStrings.md4]
    
    inline def md5: typings.loaderUtils.loaderUtilsStrings.md5 = "md5".asInstanceOf[typings.loaderUtils.loaderUtilsStrings.md5]
    
    inline def sha1: typings.loaderUtils.loaderUtilsStrings.sha1 = "sha1".asInstanceOf[typings.loaderUtils.loaderUtilsStrings.sha1]
    
    inline def sha256: typings.loaderUtils.loaderUtilsStrings.sha256 = "sha256".asInstanceOf[typings.loaderUtils.loaderUtilsStrings.sha256]
    
    inline def sha512: typings.loaderUtils.loaderUtilsStrings.sha512 = "sha512".asInstanceOf[typings.loaderUtils.loaderUtilsStrings.sha512]
  }
  
  trait InterpolateOption extends StObject {
    
    var content: js.UndefOr[String | Buffer] = js.undefined
    
    var context: js.UndefOr[String] = js.undefined
    
    var regExp: js.UndefOr[String | js.RegExp] = js.undefined
  }
  object InterpolateOption {
    
    inline def apply(): InterpolateOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InterpolateOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InterpolateOption] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String | Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setRegExp(value: String | js.RegExp): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
      
      inline def setRegExpUndefined: Self = StObject.set(x, "regExp", js.undefined)
    }
  }
  
  type OptionObject = StringDictionary[Null | `false` | `true` | String]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {readonly [ P in keyof T ]: T[P]}
    }}}
    */
  type Readonly[T] = T
}
