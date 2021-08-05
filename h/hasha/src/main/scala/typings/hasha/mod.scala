package typings.hasha

import typings.hasha.hashaStrings.buffer
import typings.hasha.hashaStrings.md5
import typings.hasha.hashaStrings.sha1
import typings.hasha.hashaStrings.sha256
import typings.hasha.hashaStrings.sha512
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.cryptoMod.Hash
import typings.typeFest.literalUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Calculate the hash for a `string`, `Buffer`, or an array thereof.
  	@param input - Data you want to hash.
  	While strings are supported you should prefer buffers as they're faster to hash. Although if you already have a string you should not convert it to a buffer.
  	Pass an array instead of concatenating strings and/or buffers. The output is the same, but arrays do not incur the overhead of concatenation.
  	@returns A hash.
  	@example
  	```
  	import hasha = require('hasha');
  	hasha('unicorn');
  	//=> 'e233b19aabc7d5e53826fb734d1222f1f0444c3a3fc67ff4af370a66e7cadd2cb24009f1bc86f0bed12ca5fcb226145ad10fc5f650f6ef0959f8aadc5a594b27'
  	```
  	*/
  inline def apply(input: HashaInput): String = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(input: HashaInput, options: Options[ToStringEncoding]): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("hasha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Asynchronously calculate the hash for a `string`, `Buffer`, or an array thereof.
  	In Node.js 12 or later, the operation is executed using `worker_threads`. A thread is lazily spawned on the first operation and lives until the end of the program execution. It's unrefed, so it won't keep the process alive.
  	@param input - Data you want to hash.
  	While strings are supported you should prefer buffers as they're faster to hash. Although if you already have a string you should not convert it to a buffer.
  	Pass an array instead of concatenating strings and/or buffers. The output is the same, but arrays do not incur the overhead of concatenation.
  	@returns A hash.
  	@example
  	```
  	import hasha = require('hasha');
  	(async () => {
  		console.log(await hasha.async('unicorn'));
  		//=> 'e233b19aabc7d5e53826fb734d1222f1f0444c3a3fc67ff4af370a66e7cadd2cb24009f1bc86f0bed12ca5fcb226145ad10fc5f650f6ef0959f8aadc5a594b27'
  	})();
  	```
  	*/
  inline def async(input: HashaInput): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def async(input: HashaInput, options: Options[ToStringEncoding]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def async_buffer(input: HashaInput, options: Options[buffer]): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  /**
  	Calculate the hash for a file.
  	In Node.js 12 or later, the operation is executed using `worker_threads`. A thread is lazily spawned on the first operation and lives until the end of the program execution. It's unrefed, so it won't keep the process alive.
  	@param filePath - Path to a file you want to hash.
  	@returns The calculated file hash.
  	@example
  	```
  	import hasha = require('hasha');
  	(async () => {
  		// Get the MD5 hash of an image
  		const hash = await hasha.fromFile('unicorn.png', {algorithm: 'md5'});
  		console.log(hash);
  		//=> '1abcb33beeb811dca15f0ac3e47b88d9'
  	})();
  	```
  	*/
  inline def fromFile(filePath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def fromFile(filePath: String, options: Options[ToStringEncoding]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
  	Synchronously calculate the hash for a file.
  	@param filePath - Path to a file you want to hash.
  	@returns The calculated file hash.
  	*/
  inline def fromFileSync(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFileSync")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fromFileSync(filePath: String, options: Options[ToStringEncoding]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFileSync")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fromFileSync_buffer(filePath: String, options: Options[buffer]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFileSync")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def fromFile_buffer(filePath: String, options: Options[buffer]): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  /**
  	Calculate the hash for a stream.
  	@param stream - A stream you want to hash.
  	@returns The calculated hash.
  	*/
  inline def fromStream(stream: ReadableStream): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def fromStream(stream: ReadableStream, options: Options[ToStringEncoding]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def fromStream_buffer(stream: ReadableStream, options: Options[buffer]): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  /**
  	Create a [hash transform stream](https://nodejs.org/api/crypto.html#crypto_class_hash).
  	@returns The created hash transform stream.
  	@example
  	```
  	import hasha = require('hasha');
  	// Hash the process input and output the hash sum
  	process.stdin.pipe(hasha.stream()).pipe(process.stdout);
  	```
  	*/
  inline def stream(): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")().asInstanceOf[Hash]
  inline def stream(options: Options[HashaEncoding]): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(options.asInstanceOf[js.Any]).asInstanceOf[Hash]
  
  type AlgorithmName = LiteralUnion[md5 | sha1 | sha256 | sha512, String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.hasha.hashaStrings.buffer
    - typings.hasha.hashaStrings.hex
    - typings.hasha.hashaStrings.base64
    - typings.hasha.hashaStrings.latin1
  */
  trait HashaEncoding extends StObject
  object HashaEncoding {
    
    inline def base64: typings.hasha.hashaStrings.base64 = "base64".asInstanceOf[typings.hasha.hashaStrings.base64]
    
    inline def buffer: typings.hasha.hashaStrings.buffer = "buffer".asInstanceOf[typings.hasha.hashaStrings.buffer]
    
    inline def hex: typings.hasha.hashaStrings.hex = "hex".asInstanceOf[typings.hasha.hashaStrings.hex]
    
    inline def latin1: typings.hasha.hashaStrings.latin1 = "latin1".asInstanceOf[typings.hasha.hashaStrings.latin1]
  }
  
  type HashaInput = Buffer | String | (js.Array[Buffer | String])
  
  trait Options[EncodingType] extends StObject {
    
    /**
    		Values: `md5` `sha1` `sha256` `sha512` _([Platform dependent](https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm_options))_
    		_The `md5` algorithm is good for [file revving](https://github.com/sindresorhus/rev-hash), but you should never use `md5` or `sha1` for anything sensitive. [They're insecure.](https://security.googleblog.com/2014/09/gradually-sunsetting-sha-1.html)_
    		@default 'sha512'
    		*/
    val algorithm: js.UndefOr[AlgorithmName] = js.undefined
    
    /**
    		Encoding of the returned hash.
    		@default 'hex'
    		*/
    val encoding: js.UndefOr[EncodingType] = js.undefined
  }
  object Options {
    
    inline def apply[EncodingType](): Options[EncodingType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[EncodingType]]
    }
    
    extension [Self <: Options[?], EncodingType](x: Self & Options[EncodingType]) {
      
      inline def setAlgorithm(value: AlgorithmName): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setEncoding(value: EncodingType): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hasha.hashaStrings.hex
    - typings.hasha.hashaStrings.base64
    - typings.hasha.hashaStrings.latin1
  */
  trait ToStringEncoding extends StObject
  object ToStringEncoding {
    
    inline def base64: typings.hasha.hashaStrings.base64 = "base64".asInstanceOf[typings.hasha.hashaStrings.base64]
    
    inline def hex: typings.hasha.hashaStrings.hex = "hex".asInstanceOf[typings.hasha.hashaStrings.hex]
    
    inline def latin1: typings.hasha.hashaStrings.latin1 = "latin1".asInstanceOf[typings.hasha.hashaStrings.latin1]
  }
}
