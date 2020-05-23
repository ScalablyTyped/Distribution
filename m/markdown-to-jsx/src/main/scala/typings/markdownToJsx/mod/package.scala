package typings.markdownToJsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentOverride[P, S] = java.lang.String | (typings.react.mod.ComponentClass[P, S]) | typings.react.mod.SFC[P] | (typings.markdownToJsx.anon.Component[P, S])
  type Markdown = typings.react.mod.Component[typings.markdownToJsx.mod.MarkdownProps, js.Object, js.Any]
}
