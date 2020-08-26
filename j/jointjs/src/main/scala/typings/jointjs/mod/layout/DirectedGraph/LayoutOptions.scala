package typings.jointjs.mod.layout.DirectedGraph

import typings.jointjs.jointjsStrings.BT
import typings.jointjs.jointjsStrings.LR
import typings.jointjs.jointjsStrings.RL
import typings.jointjs.jointjsStrings.TB
import typings.jointjs.jointjsStrings.`longest-path`
import typings.jointjs.jointjsStrings.`network-simplex`
import typings.jointjs.jointjsStrings.`tight-tree`
import typings.jointjs.mod.dia.BBox
import typings.jointjs.mod.dia.Element
import typings.jointjs.mod.dia.Link
import typings.jointjs.mod.dia.Padding
import typings.jointjs.mod.dia.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutOptions extends js.Object {
  var clusterPadding: js.UndefOr[Padding] = js.native
  var dagre: js.UndefOr[js.Any] = js.native
  var debugTiming: js.UndefOr[Boolean] = js.native
  var edgeSep: js.UndefOr[Double] = js.native
  var exportElement: js.UndefOr[js.Function1[/* element */ Element, Node]] = js.native
  var exportLink: js.UndefOr[js.Function1[/* link */ Link, Edge]] = js.native
  var graphlib: js.UndefOr[js.Any] = js.native
  var marginX: js.UndefOr[Double] = js.native
  var marginY: js.UndefOr[Double] = js.native
  var nodeSep: js.UndefOr[Double] = js.native
  var rankDir: js.UndefOr[TB | BT | LR | RL] = js.native
  var rankSep: js.UndefOr[Double] = js.native
  var ranker: js.UndefOr[`network-simplex` | `tight-tree` | `longest-path`] = js.native
  var resizeClusters: js.UndefOr[Boolean] = js.native
  var setLabels: js.UndefOr[
    Boolean | (js.Function3[/* link */ Link, /* position */ Point, /* points */ js.Array[Point], Unit])
  ] = js.native
  // deprecated
  var setLinkVertices: js.UndefOr[Boolean] = js.native
  var setPosition: js.UndefOr[js.Function2[/* element */ Element, /* position */ BBox, Unit]] = js.native
  var setVertices: js.UndefOr[Boolean | (js.Function2[/* link */ Link, /* vertices */ js.Array[Point], Unit])] = js.native
}

object LayoutOptions {
  @scala.inline
  def apply(): LayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  implicit class LayoutOptionsOps[Self <: LayoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClusterPadding(value: Padding): Self = this.set("clusterPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterPadding: Self = this.set("clusterPadding", js.undefined)
    @scala.inline
    def setDagre(value: js.Any): Self = this.set("dagre", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDagre: Self = this.set("dagre", js.undefined)
    @scala.inline
    def setDebugTiming(value: Boolean): Self = this.set("debugTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugTiming: Self = this.set("debugTiming", js.undefined)
    @scala.inline
    def setEdgeSep(value: Double): Self = this.set("edgeSep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeSep: Self = this.set("edgeSep", js.undefined)
    @scala.inline
    def setExportElement(value: /* element */ Element => Node): Self = this.set("exportElement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExportElement: Self = this.set("exportElement", js.undefined)
    @scala.inline
    def setExportLink(value: /* link */ Link => Edge): Self = this.set("exportLink", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExportLink: Self = this.set("exportLink", js.undefined)
    @scala.inline
    def setGraphlib(value: js.Any): Self = this.set("graphlib", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphlib: Self = this.set("graphlib", js.undefined)
    @scala.inline
    def setMarginX(value: Double): Self = this.set("marginX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginX: Self = this.set("marginX", js.undefined)
    @scala.inline
    def setMarginY(value: Double): Self = this.set("marginY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginY: Self = this.set("marginY", js.undefined)
    @scala.inline
    def setNodeSep(value: Double): Self = this.set("nodeSep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeSep: Self = this.set("nodeSep", js.undefined)
    @scala.inline
    def setRankDir(value: TB | BT | LR | RL): Self = this.set("rankDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRankDir: Self = this.set("rankDir", js.undefined)
    @scala.inline
    def setRankSep(value: Double): Self = this.set("rankSep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRankSep: Self = this.set("rankSep", js.undefined)
    @scala.inline
    def setRanker(value: `network-simplex` | `tight-tree` | `longest-path`): Self = this.set("ranker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRanker: Self = this.set("ranker", js.undefined)
    @scala.inline
    def setResizeClusters(value: Boolean): Self = this.set("resizeClusters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeClusters: Self = this.set("resizeClusters", js.undefined)
    @scala.inline
    def setSetLabelsFunction3(value: (/* link */ Link, /* position */ Point, /* points */ js.Array[Point]) => Unit): Self = this.set("setLabels", js.Any.fromFunction3(value))
    @scala.inline
    def setSetLabels(
      value: Boolean | (js.Function3[/* link */ Link, /* position */ Point, /* points */ js.Array[Point], Unit])
    ): Self = this.set("setLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetLabels: Self = this.set("setLabels", js.undefined)
    @scala.inline
    def setSetLinkVertices(value: Boolean): Self = this.set("setLinkVertices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetLinkVertices: Self = this.set("setLinkVertices", js.undefined)
    @scala.inline
    def setSetPosition(value: (/* element */ Element, /* position */ BBox) => Unit): Self = this.set("setPosition", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetPosition: Self = this.set("setPosition", js.undefined)
    @scala.inline
    def setSetVerticesFunction2(value: (/* link */ Link, /* vertices */ js.Array[Point]) => Unit): Self = this.set("setVertices", js.Any.fromFunction2(value))
    @scala.inline
    def setSetVertices(value: Boolean | (js.Function2[/* link */ Link, /* vertices */ js.Array[Point], Unit])): Self = this.set("setVertices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetVertices: Self = this.set("setVertices", js.undefined)
  }
  
}

