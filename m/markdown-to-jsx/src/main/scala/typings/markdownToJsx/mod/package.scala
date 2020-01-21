package typings.markdownToJsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentOverride = java.lang.String | (typings.react.mod.ComponentClass[js.Object, typings.react.mod.ComponentState]) | typings.react.mod.SFC[js.Object] | typings.markdownToJsx.AnonComponent
  type Markdown = typings.react.mod.Component[typings.markdownToJsx.mod.MarkdownProps, js.Object, js.Any]
}
