package typings.isPng

import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-png", JSImport.Namespace)
  @js.native
  def apply(buffer: Buffer): Boolean = js.native
  /**
  Check if a Buffer/Uint8Array is a [PNG](https://en.wikipedia.org/wiki/Portable_Network_Graphics) image.
  @param buffer - The buffer to check. It only needs the first 8 bytes.
  @returns Whether `buffer` contains a PNG image.
  @example
  ```
  // Node.js:
  import readChunk = require('read-chunk');
  import isPng = require('is-png');
  const buffer = readChunk.sync('unicorn.png', 0, 8);
  isPng(buffer);
  //=> true
  // Browser:
  (async () => {
  	const response = await fetch('unicorn.png');
  	const buffer = await response.arrayBuffer();
  	isPng(new Uint8Array(buffer));
  	//=> true
  })();
  ```
  */
  @JSImport("is-png", JSImport.Namespace)
  @js.native
  def apply(buffer: Uint8Array): Boolean = js.native
}
