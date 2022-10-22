package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.distCoreTypesMod.IComponent
import typings.inferno.distCoreTypesMod.Inferno.^
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

/* Rewritten from type alias, can be one of: 
  - typings.inferno.infernoStrings.alert
  - typings.inferno.infernoStrings.alertdialog
  - typings.inferno.infernoStrings.application
  - typings.inferno.infernoStrings.article
  - typings.inferno.infernoStrings.banner
  - typings.inferno.infernoStrings.button
  - typings.inferno.infernoStrings.cell
  - typings.inferno.infernoStrings.checkbox
  - typings.inferno.infernoStrings.columnheader
  - typings.inferno.infernoStrings.combobox
  - typings.inferno.infernoStrings.complementary
  - typings.inferno.infernoStrings.contentinfo
  - typings.inferno.infernoStrings.definition
  - typings.inferno.infernoStrings.dialog
  - typings.inferno.infernoStrings.directory
  - typings.inferno.infernoStrings.document
  - typings.inferno.infernoStrings.feed
  - typings.inferno.infernoStrings.figure
  - typings.inferno.infernoStrings.form
  - typings.inferno.infernoStrings.grid
  - typings.inferno.infernoStrings.gridcell
  - typings.inferno.infernoStrings.group
  - typings.inferno.infernoStrings.heading
  - typings.inferno.infernoStrings.img
  - typings.inferno.infernoStrings.link
  - typings.inferno.infernoStrings.list
  - typings.inferno.infernoStrings.listbox
  - typings.inferno.infernoStrings.listitem
  - typings.inferno.infernoStrings.log
  - typings.inferno.infernoStrings.main
  - typings.inferno.infernoStrings.marquee
  - typings.inferno.infernoStrings.math
  - typings.inferno.infernoStrings.menu
  - typings.inferno.infernoStrings.menubar
  - typings.inferno.infernoStrings.menuitem
  - typings.inferno.infernoStrings.menuitemcheckbox
  - typings.inferno.infernoStrings.menuitemradio
  - typings.inferno.infernoStrings.navigation
  - typings.inferno.infernoStrings.none
  - typings.inferno.infernoStrings.note
  - typings.inferno.infernoStrings.option
  - typings.inferno.infernoStrings.presentation
  - typings.inferno.infernoStrings.progressbar
  - typings.inferno.infernoStrings.radio
  - typings.inferno.infernoStrings.radiogroup
  - typings.inferno.infernoStrings.region
  - typings.inferno.infernoStrings.row
  - typings.inferno.infernoStrings.rowgroup
  - typings.inferno.infernoStrings.rowheader
  - typings.inferno.infernoStrings.scrollbar
  - typings.inferno.infernoStrings.search
  - typings.inferno.infernoStrings.searchbox
  - typings.inferno.infernoStrings.separator
  - typings.inferno.infernoStrings.slider
  - typings.inferno.infernoStrings.spinbutton
  - typings.inferno.infernoStrings.status
  - typings.inferno.infernoStrings.switch
  - typings.inferno.infernoStrings.tab
  - typings.inferno.infernoStrings.table
  - typings.inferno.infernoStrings.tablist
  - typings.inferno.infernoStrings.tabpanel
  - typings.inferno.infernoStrings.term
  - typings.inferno.infernoStrings.textbox
  - typings.inferno.infernoStrings.timer
  - typings.inferno.infernoStrings.toolbar
  - typings.inferno.infernoStrings.tooltip
  - typings.inferno.infernoStrings.tree
  - typings.inferno.infernoStrings.treegrid
  - typings.inferno.infernoStrings.treeitem
  - java.lang.String
*/
type AriaRole = _AriaRole | String

type AudioHTMLAttributes[T] = MediaHTMLAttributes[T]

type CElement[P, T /* <: IComponent[P, ComponentState] */] = ComponentElement[P, T]

type CFactory[P, T /* <: IComponent[P, ComponentState] */] = ComponentFactory[P, T]

type ClassicElement[P] = CElement[P, ClassicComponent[P, ComponentState]]

type ClassicFactory[P] = CFactory[P, ClassicComponent[P, ComponentState]]

type ComponentState = js.Object

type DetailedHTMLProps[E /* <: HTMLAttributes[T] */, T] = ClassAttributes[T] & E

type ExoticComponent[P] = js.Function1[/* props */ P, InfernoElement[Any]]

/* Rewritten from type alias, can be one of: 
  - typings.inferno.infernoStrings._self
  - typings.inferno.infernoStrings._blank
  - typings.inferno.infernoStrings._parent
  - typings.inferno.infernoStrings._top
  - java.lang.String
*/
type HTMLAttributeAnchorTarget = _HTMLAttributeAnchorTarget | String

type HTMLFactory[T /* <: HTMLElement */] = DetailedHTMLFactory[AllHTMLAttributes[T], T]

/* Rewritten from type alias, can be one of: 
  - typings.inferno.infernoStrings.button
  - typings.inferno.infernoStrings.checkbox
  - typings.inferno.infernoStrings.color
  - typings.inferno.infernoStrings.date
  - typings.inferno.infernoStrings.`datetime-local`
  - typings.inferno.infernoStrings.email
  - typings.inferno.infernoStrings.file
  - typings.inferno.infernoStrings.hidden
  - typings.inferno.infernoStrings.image
  - typings.inferno.infernoStrings.month
  - typings.inferno.infernoStrings.number
  - typings.inferno.infernoStrings.password
  - typings.inferno.infernoStrings.radio
  - typings.inferno.infernoStrings.range
  - typings.inferno.infernoStrings.reset
  - typings.inferno.infernoStrings.search
  - typings.inferno.infernoStrings.submit
  - typings.inferno.infernoStrings.tel
  - typings.inferno.infernoStrings.text
  - typings.inferno.infernoStrings.time
  - typings.inferno.infernoStrings.url
  - typings.inferno.infernoStrings.week
  - java.lang.String
*/
type HTMLInputTypeAttribute = _HTMLInputTypeAttribute | String

type InfernoChild = InfernoElement[Any] | InfernoText

type InfernoFragment = js.Object | InfernoNodeArray

type InfernoHTMLElement[T /* <: HTMLElement */] = DetailedInfernoHTMLElement[AllHTMLAttributes[T], T]

type InfernoNode = js.UndefOr[InfernoChild | InfernoFragment | Boolean | Null]

type InfernoText = String | Double

type Key = String | Double

type SFC[P] = StatelessComponent[P]
