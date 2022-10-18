package typings.isProgressive

import typings.node.bufferMod.global.Buffer
import typings.node.nodeColonstreamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("is-progressive", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Checks if a `Buffer` contains a JPEG image that is [progressive](http://www.faqs.org/faqs/jpeg-faq/part1/section-11.html).
    	@param buffer - The buffer of a JPEG image. Must be at least `65535` bytes when the file is larger than that.
    	@returns Whether the `buffer` is a progressive JPEG image.
    	@example
    	```
    	import {promisify} from 'node:util';
    	import {readFile} from 'node:fs/promises';
    	import isProgressive from 'is-progressive';
    	const buffer = await readFile('baseline.jpg');
    	console.log(await isProgressive.buffer(buffer));
    	//=> false
    	```
    	*/
    inline def buffer(buffer: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
    	Checks if a file is a JPEG image that is [progressive](http://www.faqs.org/faqs/jpeg-faq/part1/section-11.html).
    	@param filePath - The file path to the image.
    	@returns Whether the file at the `filePath` is a progressive JPEG image.
    	@example
    	```
    	import isProgressive from 'is-progressive';
    	console.log(await isProgressive.file('baseline.jpg'));
    	//=> false
    	```
    	*/
    inline def file(filePath: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    /**
    	Synchronously checks if a file is a JPEG image that is [progressive](http://www.faqs.org/faqs/jpeg-faq/part1/section-11.html).
    	@param filePath - The file path to the image.
    	@returns Whether the the file at the `filePath` is a progressive JPEG.
    	@example
    	```
    	import isProgressive from 'is-progressive';
    	isProgressive.fileSync('progressive.jpg');
    	//=> true
    	```
    	*/
    inline def fileSync(filePath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSync")(filePath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
    	Checks if a `stream.Readable` produces a JPEG image that is [progressive](http://www.faqs.org/faqs/jpeg-faq/part1/section-11.html).
    	@param stream - A data stream with a JPEG image.
    	@returns Whether the `stream` is a progressive JPEG image.
    	@example
    	```
    	// Check if a remote JPEG image is progressive without downloading the whole file
    	import https from 'https';
    	import isProgressive from 'is-progressive';
    	const url = 'https://raw.githubusercontent.com/sindresorhus/is-progressive/main/fixture/progressive.jpg';
    	https.get(url, async response => {
    		console.log(await isProgressive.stream(response));
    		//=> true
    	});
    	```
    	*/
    inline def stream(stream: Readable): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  }
}
