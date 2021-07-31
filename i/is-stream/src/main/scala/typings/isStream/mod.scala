package typings.isStream

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  @scala.inline
  def apply(stream: js.Any): /* is node.stream.Stream */ Boolean = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[/* is node.stream.Stream */ Boolean]
  
  @JSImport("is-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @scala.inline
  def duplex(stream: js.Any): /* is node.stream.Duplex */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("duplex")(stream.asInstanceOf[js.Any]).asInstanceOf[/* is node.stream.Duplex */ Boolean]
  
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
  @scala.inline
  def readable(stream: js.Any): /* is node.stream.Readable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("readable")(stream.asInstanceOf[js.Any]).asInstanceOf[/* is node.stream.Readable */ Boolean]
  
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
  @scala.inline
  def transform(input: js.Any): /* is node.stream.Transform */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(input.asInstanceOf[js.Any]).asInstanceOf[/* is node.stream.Transform */ Boolean]
  
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
  @scala.inline
  def writable(stream: js.Any): /* is node.stream.Writable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("writable")(stream.asInstanceOf[js.Any]).asInstanceOf[/* is node.stream.Writable */ Boolean]
}
