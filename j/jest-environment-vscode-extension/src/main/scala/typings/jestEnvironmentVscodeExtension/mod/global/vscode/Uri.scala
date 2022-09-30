package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import typings.vscode.anon.Authority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.Uri")
@js.native
open class Uri protected ()
  extends typings.vscode.mod.Uri {
  /**
    * Use the `file` and `parse` factory functions to create new `Uri` objects.
    */
  /* private */ def this(scheme: String, authority: String, path: String, query: String, fragment: String) = this()
}
/* static members */
object Uri {
  
  @JSGlobal("vscode.Uri")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create an URI from a file system path. The {@link Uri.scheme scheme}
    * will be `file`.
    *
    * The *difference* between {@link Uri.parse} and {@link Uri.file} is that the latter treats the argument
    * as path, not as stringified-uri. E.g. `Uri.file(path)` is *not* the same as
    * `Uri.parse('file://' + path)` because the path might contain characters that are
    * interpreted (# and ?). See the following sample:
    * ```ts
    * const good = URI.file('/coding/c#/project1');
    * good.scheme === 'file';
    * good.path === '/coding/c#/project1';
    * good.fragment === '';
    *
    * const bad = URI.parse('file://' + '/coding/c#/project1');
    * bad.scheme === 'file';
    * bad.path === '/coding/c'; // path is now broken
    * bad.fragment === '/project1';
    * ```
    *
    * @param path A file system or UNC path.
    * @return A new Uri instance.
    */
  inline def file(path: String): typings.vscode.mod.Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(path.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.Uri]
  
  /**
    * Create an URI from its component parts
    *
    * @see {@link Uri.toString}
    * @param components The component parts of an Uri.
    * @return A new Uri instance.
    */
  inline def from(components: Authority): typings.vscode.mod.Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(components.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.Uri]
  
  /**
    * Create a new uri which path is the result of joining
    * the path of the base uri with the provided path segments.
    *
    * - Note 1: `joinPath` only affects the path component
    * and all other components (scheme, authority, query, and fragment) are
    * left as they are.
    * - Note 2: The base uri must have a path; an error is thrown otherwise.
    *
    * The path segments are normalized in the following ways:
    * - sequences of path separators (`/` or `\`) are replaced with a single separator
    * - for `file`-uris on windows, the backslash-character (`\`) is considered a path-separator
    * - the `..`-segment denotes the parent segment, the `.` denotes the current segment
    * - paths have a root which always remains, for instance on windows drive-letters are roots
    * so that is true: `joinPath(Uri.file('file:///c:/root'), '../../other').fsPath === 'c:/other'`
    *
    * @param base An uri. Must have a path.
    * @param pathSegments One more more path fragments
    * @returns A new uri which path is joined with the given fragments
    */
  inline def joinPath(base: typings.vscode.mod.Uri, pathSegments: String*): typings.vscode.mod.Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("joinPath")(scala.List(base.asInstanceOf[js.Any]).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typings.vscode.mod.Uri]
  
  /**
    * Create an URI from a string, e.g. `http://www.example.com/some/path`,
    * `file:///usr/home`, or `scheme:with/path`.
    *
    * *Note* that for a while uris without a `scheme` were accepted. That is not correct
    * as all uris should have a scheme. To avoid breakage of existing code the optional
    * `strict`-argument has been added. We *strongly* advise to use it, e.g. `Uri.parse('my:uri', true)`
    *
    * @see {@link Uri.toString}
    * @param value The string value of an Uri.
    * @param strict Throw an error when `value` is empty or when no `scheme` can be parsed.
    * @return A new Uri instance.
    */
  inline def parse(value: String): typings.vscode.mod.Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.Uri]
  inline def parse(value: String, strict: Boolean): typings.vscode.mod.Uri = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Uri]
}
