package typings
package jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverOptions extends js.Object {
  /**
    * The `canRead` property tells JSON Schema `$Ref` Parser what kind of files your resolver can read. In this example, we've simply specified a regular expression that matches "mogodb://" URLs, but we could have used a simple boolean, or even a function with custom logic to determine which files to resolve. Here are examples of each approach:
    */
  var canRead: scala.Boolean | stdLib.RegExp | java.lang.String | js.Array[java.lang.String] | (js.Function1[/* file */ FileInfo, scala.Boolean]) = js.native
  /**
    * All resolvers have an order property, even the built-in resolvers. If you don't specify an order property, then your resolver will run last. Specifying `order: 1`, like we did in this example, will make your resolver run first. Or you can squeeze your resolver in-between some of the built-in resolvers. For example, `order: 101` would make it run after the file resolver, but before the HTTP resolver. You can see the order of all the built-in resolvers by looking at their source code.
    *
    * The order property and canRead property are related to each other. For each file that JSON Schema $Ref Parser needs to resolve, it first determines which resolvers can read that file by checking their canRead property. If only one resolver matches a file, then only that one resolver is called, regardless of its order. If multiple resolvers match a file, then those resolvers are tried in order until one of them successfully reads the file. Once a resolver successfully reads the file, the rest of the resolvers are skipped.
    */
  var order: js.UndefOr[scala.Double] = js.native
  /**
    * This is where the real work of a resolver happens. The `read` method accepts the same file info object as the `canRead` function, but rather than returning a boolean value, the `read` method should return the contents of the file. The file contents should be returned in as raw a form as possible, such as a string or a byte array. Any further parsing or processing should be done by parsers.
    *
    * Unlike the `canRead` function, the `read` method can also be asynchronous. This might be important if your resolver needs to read data from a database or some other external source. You can return your asynchronous value using either an ES6 Promise or a Node.js-style error-first callback. Of course, if your resolver has the ability to return its data synchronously, then that's fine too. Here are examples of all three approaches:
    */
  def read(file: FileInfo): java.lang.String | nodeLib.Buffer | (js.Promise[java.lang.String | nodeLib.Buffer]) = js.native
  def read(
    file: FileInfo,
    callback: js.Function2[/* error */ stdLib.Error | scala.Null, /* data */ java.lang.String | scala.Null, _]
  ): java.lang.String | nodeLib.Buffer | (js.Promise[java.lang.String | nodeLib.Buffer]) = js.native
}

