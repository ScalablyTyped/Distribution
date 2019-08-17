package typings.markdownDashToDashJsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object markdownDashToDashJsxMod {
  import typings.markdownDashToDashJsx.Anon_Component
  import typings.react.reactMod.Component
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.SFC

  type ComponentOverride = String | (ComponentClass[js.Object, ComponentState]) | SFC[js.Object] | Anon_Component
  type Markdown = Component[MarkdownProps, js.Object, js.Any]
}
