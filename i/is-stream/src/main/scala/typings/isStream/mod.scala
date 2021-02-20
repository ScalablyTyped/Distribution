package typings.isStream

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	@returns Whether `stream` is a [`Stream`](https://nodejs.org/api/stream.html#stream_stream).
  	@example
  	```
  	import * as fs from 'fs';
  	import isStream = require('is-stream');
  	isStream(fs.createReadStream('unicorn.png'));
  	//=> true
  	isStream({});
  	//=> false
  	```
  	*/
  @JSImport("is-stream", JSImport.Namespace)
  @js.native
  def apply(stream: js.Any): /* is node.stream.Stream */ Boolean = js.native
  
  /**
  	@returns Whether `stream` is a [`stream.Duplex`](https://nodejs.org/api/stream.html#stream_class_stream_duplex).
  	@example
  	```
  	import {Duplex} from 'stream';
  	import isStream = require('is-stream');
  	isStream.duplex(new Duplex());
  	//=> true
  	```
  	*/
  @JSImport("is-stream", "duplex")
  @js.native
  def duplex(stream: js.Any): /* is node.stream.Duplex */ Boolean = js.native
  
  /**
  	@returns Whether `stream` is a [`stream.Readable`](https://nodejs.org/api/stream.html#stream_class_stream_readable).
  	@example
  	```
  	import * as fs from 'fs';
  	import isStream = require('is-stream');
  	isStream.readable(fs.createReadStream('unicorn.png'));
  	//=> true
  	```
  	*/
  @JSImport("is-stream", "readable")
  @js.native
  def readable(stream: js.Any): /* is node.stream.Readable */ Boolean = js.native
  
  /**
  	@returns Whether `stream` is a [`stream.Transform`](https://nodejs.org/api/stream.html#stream_class_stream_transform).
  	@example
  	```
  	import * as fs from 'fs';
  	import Stringify = require('streaming-json-stringify');
  	import isStream = require('is-stream');
  	isStream.transform(Stringify());
  	//=> true
  	```
  	*/
  @JSImport("is-stream", "transform")
  @js.native
  def transform(input: js.Any): /* is node.stream.Transform */ Boolean = js.native
  
  /**
  	@returns Whether `stream` is a [`stream.Writable`](https://nodejs.org/api/stream.html#stream_class_stream_writable).
  	@example
  	```
  	import * as fs from 'fs';
  	import isStream = require('is-stream');
  	isStream.writable(fs.createWriteStrem('unicorn.txt'));
  	//=> true
  	```
  	*/
  @JSImport("is-stream", "writable")
  @js.native
  def writable(stream: js.Any): /* is node.stream.Writable */ Boolean = js.native
}
