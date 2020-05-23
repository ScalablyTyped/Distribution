package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ipp.ippStrings.bale
  - typings.ipp.ippStrings.bind
  - typings.ipp.ippStrings.`bind-bottom`
  - typings.ipp.ippStrings.`bind-left`
  - typings.ipp.ippStrings.`bind-right`
  - typings.ipp.ippStrings.`bind-top`
  - typings.ipp.ippStrings.`booklet-maker`
  - typings.ipp.ippStrings.coat
  - typings.ipp.ippStrings.cover
  - typings.ipp.ippStrings.`edge-stitch`
  - typings.ipp.ippStrings.`edge-stitch-bottom`
  - typings.ipp.ippStrings.`edge-stitch-left`
  - typings.ipp.ippStrings.`edge-stitch-right`
  - typings.ipp.ippStrings.`edge-stitch-top`
  - typings.ipp.ippStrings.fold
  - typings.ipp.ippStrings.`fold-accordion`
  - typings.ipp.ippStrings.`fold-double-gate`
  - typings.ipp.ippStrings.`fold-engineering-z`
  - typings.ipp.ippStrings.`fold-gate`
  - typings.ipp.ippStrings.`fold-half`
  - typings.ipp.ippStrings.`fold-half-z`
  - typings.ipp.ippStrings.`fold-left-gate`
  - typings.ipp.ippStrings.`fold-letter`
  - typings.ipp.ippStrings.`fold-parallel`
  - typings.ipp.ippStrings.`fold-poster`
  - typings.ipp.ippStrings.`fold-right-gate`
  - typings.ipp.ippStrings.`fold-z`
  - typings.ipp.ippStrings.`jdf-f2-1`
  - typings.ipp.ippStrings.`jdf-f4-1`
  - typings.ipp.ippStrings.`jdf-f4-2`
  - typings.ipp.ippStrings.`jdf-f6-1`
  - typings.ipp.ippStrings.`jdf-f6-2`
  - typings.ipp.ippStrings.`jdf-f6-3`
  - typings.ipp.ippStrings.`jdf-f6-4`
  - typings.ipp.ippStrings.`jdf-f6-5`
  - typings.ipp.ippStrings.`jdf-f6-6`
  - typings.ipp.ippStrings.`jdf-f6-7`
  - typings.ipp.ippStrings.`jdf-f6-8`
  - typings.ipp.ippStrings.`jdf-f8-1`
  - typings.ipp.ippStrings.`jdf-f8-2`
  - typings.ipp.ippStrings.`jdf-f8-3`
  - typings.ipp.ippStrings.`jdf-f8-4`
  - typings.ipp.ippStrings.`jdf-f8-5`
  - typings.ipp.ippStrings.`jdf-f8-6`
  - typings.ipp.ippStrings.`jdf-f8-7`
  - typings.ipp.ippStrings.`jdf-f10-1`
  - typings.ipp.ippStrings.`jdf-f10-2`
  - typings.ipp.ippStrings.`jdf-f10-3`
  - typings.ipp.ippStrings.`jdf-f12-1`
  - typings.ipp.ippStrings.`jdf-f12-2`
  - typings.ipp.ippStrings.`jdf-f12-3`
  - typings.ipp.ippStrings.`jdf-f12-4`
  - typings.ipp.ippStrings.`jdf-f12-5`
  - typings.ipp.ippStrings.`jdf-f12-6`
  - typings.ipp.ippStrings.`jdf-f12-7`
  - typings.ipp.ippStrings.`jdf-f12-8`
  - typings.ipp.ippStrings.`jdf-f12-9`
  - typings.ipp.ippStrings.`jdf-f12-10`
  - typings.ipp.ippStrings.`jdf-f12-11`
  - typings.ipp.ippStrings.`jdf-f12-12`
  - typings.ipp.ippStrings.`jdf-f12-13`
  - typings.ipp.ippStrings.`jdf-f12-14`
  - typings.ipp.ippStrings.`jdf-f14-1`
  - typings.ipp.ippStrings.`jdf-f16-1`
  - typings.ipp.ippStrings.`jdf-f16-2`
  - typings.ipp.ippStrings.`jdf-f16-3`
  - typings.ipp.ippStrings.`jdf-f16-4`
  - typings.ipp.ippStrings.`jdf-f16-5`
  - typings.ipp.ippStrings.`jdf-f16-6`
  - typings.ipp.ippStrings.`jdf-f16-7`
  - typings.ipp.ippStrings.`jdf-f16-8`
  - typings.ipp.ippStrings.`jdf-f16-9`
  - typings.ipp.ippStrings.`jdf-f16-10`
  - typings.ipp.ippStrings.`jdf-f16-11`
  - typings.ipp.ippStrings.`jdf-f16-12`
  - typings.ipp.ippStrings.`jdf-f16-13`
  - typings.ipp.ippStrings.`jdf-f16-14`
  - typings.ipp.ippStrings.`jdf-f18-1`
  - typings.ipp.ippStrings.`jdf-f18-2`
  - typings.ipp.ippStrings.`jdf-f18-3`
  - typings.ipp.ippStrings.`jdf-f18-4`
  - typings.ipp.ippStrings.`jdf-f18-5`
  - typings.ipp.ippStrings.`jdf-f18-6`
  - typings.ipp.ippStrings.`jdf-f18-7`
  - typings.ipp.ippStrings.`jdf-f18-8`
  - typings.ipp.ippStrings.`jdf-f18-9`
  - typings.ipp.ippStrings.`jdf-f20-1`
  - typings.ipp.ippStrings.`jdf-f20-2`
  - typings.ipp.ippStrings.`jdf-f24-1`
  - typings.ipp.ippStrings.`jdf-f24-2`
  - typings.ipp.ippStrings.`jdf-f24-3`
  - typings.ipp.ippStrings.`jdf-f24-4`
  - typings.ipp.ippStrings.`jdf-f24-5`
  - typings.ipp.ippStrings.`jdf-f24-6`
  - typings.ipp.ippStrings.`jdf-f24-7`
  - typings.ipp.ippStrings.`jdf-f24-8`
  - typings.ipp.ippStrings.`jdf-f24-9`
  - typings.ipp.ippStrings.`jdf-f24-10`
  - typings.ipp.ippStrings.`jdf-f24-11`
  - typings.ipp.ippStrings.`jdf-f28-1`
  - typings.ipp.ippStrings.`jdf-f32-1`
  - typings.ipp.ippStrings.`jdf-f32-2`
  - typings.ipp.ippStrings.`jdf-f32-3`
  - typings.ipp.ippStrings.`jdf-f32-4`
  - typings.ipp.ippStrings.`jdf-f32-5`
  - typings.ipp.ippStrings.`jdf-f32-6`
  - typings.ipp.ippStrings.`jdf-f32-7`
  - typings.ipp.ippStrings.`jdf-f32-8`
  - typings.ipp.ippStrings.`jdf-f32-9`
  - typings.ipp.ippStrings.`jdf-f36-1`
  - typings.ipp.ippStrings.`jdf-f36-2`
  - typings.ipp.ippStrings.`jdf-f40-1`
  - typings.ipp.ippStrings.`jdf-f48-1`
  - typings.ipp.ippStrings.`jdf-f48-2`
  - typings.ipp.ippStrings.`jdf-f64-1`
  - typings.ipp.ippStrings.`jdf-f64-2`
  - typings.ipp.ippStrings.`jog-offset`
  - typings.ipp.ippStrings.laminate
  - typings.ipp.ippStrings.punch
  - typings.ipp.ippStrings.`punch-bottom-left`
  - typings.ipp.ippStrings.`punch-bottom-right`
  - typings.ipp.ippStrings.`punch-dual-bottom`
  - typings.ipp.ippStrings.`punch-dual-left`
  - typings.ipp.ippStrings.`punch-dual-right`
  - typings.ipp.ippStrings.`punch-dual-top`
  - typings.ipp.ippStrings.`punch-multiple-bottom`
  - typings.ipp.ippStrings.`punch-multiple-left`
  - typings.ipp.ippStrings.`punch-multiple-right`
  - typings.ipp.ippStrings.`punch-multiple-top`
  - typings.ipp.ippStrings.`punch-quad-bottom`
  - typings.ipp.ippStrings.`punch-quad-left`
  - typings.ipp.ippStrings.`punch-quad-right`
  - typings.ipp.ippStrings.`punch-quad-top`
  - typings.ipp.ippStrings.`punch-top-left`
  - typings.ipp.ippStrings.`punch-top-right`
  - typings.ipp.ippStrings.`punch-triple-bottom`
  - typings.ipp.ippStrings.`punch-triple-left`
  - typings.ipp.ippStrings.`punch-triple-right`
  - typings.ipp.ippStrings.`punch-triple-top`
  - typings.ipp.ippStrings.`saddle-stitch`
  - typings.ipp.ippStrings.staple
  - typings.ipp.ippStrings.`staple-bottom-left`
  - typings.ipp.ippStrings.`staple-bottom-right`
  - typings.ipp.ippStrings.`staple-dual-bottom`
  - typings.ipp.ippStrings.`staple-dual-left`
  - typings.ipp.ippStrings.`staple-dual-right`
  - typings.ipp.ippStrings.`staple-dual-top`
  - typings.ipp.ippStrings.`staple-top-left`
  - typings.ipp.ippStrings.`staple-top-right`
  - typings.ipp.ippStrings.`staple-triple-bottom`
  - typings.ipp.ippStrings.`staple-triple-left`
  - typings.ipp.ippStrings.`staple-triple-right`
  - typings.ipp.ippStrings.`staple-triple-top`
  - typings.ipp.ippStrings.trim
  - typings.ipp.ippStrings.`trim-after-copies`
  - typings.ipp.ippStrings.`trim-after-documents`
  - typings.ipp.ippStrings.`trim-after-job`
  - typings.ipp.ippStrings.`trim-after-pages`
*/
trait Finishings extends js.Object

object Finishings {
  @scala.inline
  def bale: typings.ipp.ippStrings.bale = "bale".asInstanceOf[typings.ipp.ippStrings.bale]
  @scala.inline
  def bind: typings.ipp.ippStrings.bind = "bind".asInstanceOf[typings.ipp.ippStrings.bind]
  @scala.inline
  def `bind-bottom`: typings.ipp.ippStrings.`bind-bottom` = "bind-bottom".asInstanceOf[typings.ipp.ippStrings.`bind-bottom`]
  @scala.inline
  def `bind-left`: typings.ipp.ippStrings.`bind-left` = "bind-left".asInstanceOf[typings.ipp.ippStrings.`bind-left`]
  @scala.inline
  def `bind-right`: typings.ipp.ippStrings.`bind-right` = "bind-right".asInstanceOf[typings.ipp.ippStrings.`bind-right`]
  @scala.inline
  def `bind-top`: typings.ipp.ippStrings.`bind-top` = "bind-top".asInstanceOf[typings.ipp.ippStrings.`bind-top`]
  @scala.inline
  def `booklet-maker`: typings.ipp.ippStrings.`booklet-maker` = "booklet-maker".asInstanceOf[typings.ipp.ippStrings.`booklet-maker`]
  @scala.inline
  def coat: typings.ipp.ippStrings.coat = "coat".asInstanceOf[typings.ipp.ippStrings.coat]
  @scala.inline
  def cover: typings.ipp.ippStrings.cover = "cover".asInstanceOf[typings.ipp.ippStrings.cover]
  @scala.inline
  def `edge-stitch`: typings.ipp.ippStrings.`edge-stitch` = "edge-stitch".asInstanceOf[typings.ipp.ippStrings.`edge-stitch`]
  @scala.inline
  def `edge-stitch-bottom`: typings.ipp.ippStrings.`edge-stitch-bottom` = "edge-stitch-bottom".asInstanceOf[typings.ipp.ippStrings.`edge-stitch-bottom`]
  @scala.inline
  def `edge-stitch-left`: typings.ipp.ippStrings.`edge-stitch-left` = "edge-stitch-left".asInstanceOf[typings.ipp.ippStrings.`edge-stitch-left`]
  @scala.inline
  def `edge-stitch-right`: typings.ipp.ippStrings.`edge-stitch-right` = "edge-stitch-right".asInstanceOf[typings.ipp.ippStrings.`edge-stitch-right`]
  @scala.inline
  def `edge-stitch-top`: typings.ipp.ippStrings.`edge-stitch-top` = "edge-stitch-top".asInstanceOf[typings.ipp.ippStrings.`edge-stitch-top`]
  @scala.inline
  def fold: typings.ipp.ippStrings.fold = "fold".asInstanceOf[typings.ipp.ippStrings.fold]
  @scala.inline
  def `fold-accordion`: typings.ipp.ippStrings.`fold-accordion` = "fold-accordion".asInstanceOf[typings.ipp.ippStrings.`fold-accordion`]
  @scala.inline
  def `fold-double-gate`: typings.ipp.ippStrings.`fold-double-gate` = "fold-double-gate".asInstanceOf[typings.ipp.ippStrings.`fold-double-gate`]
  @scala.inline
  def `fold-engineering-z`: typings.ipp.ippStrings.`fold-engineering-z` = "fold-engineering-z".asInstanceOf[typings.ipp.ippStrings.`fold-engineering-z`]
  @scala.inline
  def `fold-gate`: typings.ipp.ippStrings.`fold-gate` = "fold-gate".asInstanceOf[typings.ipp.ippStrings.`fold-gate`]
  @scala.inline
  def `fold-half`: typings.ipp.ippStrings.`fold-half` = "fold-half".asInstanceOf[typings.ipp.ippStrings.`fold-half`]
  @scala.inline
  def `fold-half-z`: typings.ipp.ippStrings.`fold-half-z` = "fold-half-z".asInstanceOf[typings.ipp.ippStrings.`fold-half-z`]
  @scala.inline
  def `fold-left-gate`: typings.ipp.ippStrings.`fold-left-gate` = "fold-left-gate".asInstanceOf[typings.ipp.ippStrings.`fold-left-gate`]
  @scala.inline
  def `fold-letter`: typings.ipp.ippStrings.`fold-letter` = "fold-letter".asInstanceOf[typings.ipp.ippStrings.`fold-letter`]
  @scala.inline
  def `fold-parallel`: typings.ipp.ippStrings.`fold-parallel` = "fold-parallel".asInstanceOf[typings.ipp.ippStrings.`fold-parallel`]
  @scala.inline
  def `fold-poster`: typings.ipp.ippStrings.`fold-poster` = "fold-poster".asInstanceOf[typings.ipp.ippStrings.`fold-poster`]
  @scala.inline
  def `fold-right-gate`: typings.ipp.ippStrings.`fold-right-gate` = "fold-right-gate".asInstanceOf[typings.ipp.ippStrings.`fold-right-gate`]
  @scala.inline
  def `fold-z`: typings.ipp.ippStrings.`fold-z` = "fold-z".asInstanceOf[typings.ipp.ippStrings.`fold-z`]
  @scala.inline
  def `jdf-f10-1`: typings.ipp.ippStrings.`jdf-f10-1` = "jdf-f10-1".asInstanceOf[typings.ipp.ippStrings.`jdf-f10-1`]
  @scala.inline
  def `jdf-f10-2`: typings.ipp.ippStrings.`jdf-f10-2` = "jdf-f10-2".asInstanceOf[typings.ipp.ippStrings.`jdf-f10-2`]
  @scala.inline
  def `jdf-f10-3`: typings.ipp.ippStrings.`jdf-f10-3` = "jdf-f10-3".asInstanceOf[typings.ipp.ippStrings.`jdf-f10-3`]
  @scala.inline
  def `jdf-f12-1`: typings.ipp.ippStrings.`jdf-f12-1` = "jdf-f12-1".asInstanceOf[typings.ipp.ippStrings.`jdf-f12-1`]
  @scala.inline
  def `jdf-f12-10`: typings.ipp.ippStrings.`jdf-f12-10` = "jdf-f12-10".asInstanceOf[typings.ipp.ippStrings.`jdf-f12-10`]
  @scala.inline
  def `jdf-f12-11`: typings.ipp.ippStrings.`jdf-f12-11` = "jdf-f12-11".asInstanceOf[typings.ipp.ippStrings.`jdf-f12-11`]
  @scala.inline
  def `jdf-f12-12`: typings.ipp.ippStrings.`jdf-f12-12` = "jdf-f12-12".asInstanceOf[typings.ipp.ippStrings.`jdf-f12-12`]
  @scala.inline
  def `jdf-f12-13`: typings.ipp.ippStrings.`jdf-f12-13` = "jdf-f12-13".asInstanceOf[typings.ipp.ippStrings.`jdf-f12-13`]
  @scala.inline
  def `jdf-f12-14`: typings.ipp.ippStrings.`jdf-f12-14` = "jdf-f12-14".asInstanceOf[typings.ipp.ippStrings.`jdf-f12-14`]
  @scala.inline
  def `jdf-f12-2`: typings.ipp.ippStrings.`jdf-f12-2` = "jdf-f12-2".asInstanceOf[typings.ipp.ippStrings.`jdf-f12-2`]
  @scala.inline
  def `jdf-f12-3`: typings.ipp.ippStrings.`jdf-f12-3` = "jdf-f12-3".asInstanceOf[typings.ipp.ippStrings.`jdf-f12-3`]
  @scala.inline
  def `jdf-f12-4`: typings.ipp.ippStrings.`jdf-f12-4` = "jdf-f12-4".asInstanceOf[typings.ipp.ippStrings.`jdf-f12-4`]
  @scala.inline
  def `jdf-f12-5`: typings.ipp.ippStrings.`jdf-f12-5` = "jdf-f12-5".asInstanceOf[typings.ipp.ippStrings.`jdf-f12-5`]
  @scala.inline
  def `jdf-f12-6`: typings.ipp.ippStrings.`jdf-f12-6` = "jdf-f12-6".asInstanceOf[typings.ipp.ippStrings.`jdf-f12-6`]
  @scala.inline
  def `jdf-f12-7`: typings.ipp.ippStrings.`jdf-f12-7` = "jdf-f12-7".asInstanceOf[typings.ipp.ippStrings.`jdf-f12-7`]
  @scala.inline
  def `jdf-f12-8`: typings.ipp.ippStrings.`jdf-f12-8` = "jdf-f12-8".asInstanceOf[typings.ipp.ippStrings.`jdf-f12-8`]
  @scala.inline
  def `jdf-f12-9`: typings.ipp.ippStrings.`jdf-f12-9` = "jdf-f12-9".asInstanceOf[typings.ipp.ippStrings.`jdf-f12-9`]
  @scala.inline
  def `jdf-f14-1`: typings.ipp.ippStrings.`jdf-f14-1` = "jdf-f14-1".asInstanceOf[typings.ipp.ippStrings.`jdf-f14-1`]
  @scala.inline
  def `jdf-f16-1`: typings.ipp.ippStrings.`jdf-f16-1` = "jdf-f16-1".asInstanceOf[typings.ipp.ippStrings.`jdf-f16-1`]
  @scala.inline
  def `jdf-f16-10`: typings.ipp.ippStrings.`jdf-f16-10` = "jdf-f16-10".asInstanceOf[typings.ipp.ippStrings.`jdf-f16-10`]
  @scala.inline
  def `jdf-f16-11`: typings.ipp.ippStrings.`jdf-f16-11` = "jdf-f16-11".asInstanceOf[typings.ipp.ippStrings.`jdf-f16-11`]
  @scala.inline
  def `jdf-f16-12`: typings.ipp.ippStrings.`jdf-f16-12` = "jdf-f16-12".asInstanceOf[typings.ipp.ippStrings.`jdf-f16-12`]
  @scala.inline
  def `jdf-f16-13`: typings.ipp.ippStrings.`jdf-f16-13` = "jdf-f16-13".asInstanceOf[typings.ipp.ippStrings.`jdf-f16-13`]
  @scala.inline
  def `jdf-f16-14`: typings.ipp.ippStrings.`jdf-f16-14` = "jdf-f16-14".asInstanceOf[typings.ipp.ippStrings.`jdf-f16-14`]
  @scala.inline
  def `jdf-f16-2`: typings.ipp.ippStrings.`jdf-f16-2` = "jdf-f16-2".asInstanceOf[typings.ipp.ippStrings.`jdf-f16-2`]
  @scala.inline
  def `jdf-f16-3`: typings.ipp.ippStrings.`jdf-f16-3` = "jdf-f16-3".asInstanceOf[typings.ipp.ippStrings.`jdf-f16-3`]
  @scala.inline
  def `jdf-f16-4`: typings.ipp.ippStrings.`jdf-f16-4` = "jdf-f16-4".asInstanceOf[typings.ipp.ippStrings.`jdf-f16-4`]
  @scala.inline
  def `jdf-f16-5`: typings.ipp.ippStrings.`jdf-f16-5` = "jdf-f16-5".asInstanceOf[typings.ipp.ippStrings.`jdf-f16-5`]
  @scala.inline
  def `jdf-f16-6`: typings.ipp.ippStrings.`jdf-f16-6` = "jdf-f16-6".asInstanceOf[typings.ipp.ippStrings.`jdf-f16-6`]
  @scala.inline
  def `jdf-f16-7`: typings.ipp.ippStrings.`jdf-f16-7` = "jdf-f16-7".asInstanceOf[typings.ipp.ippStrings.`jdf-f16-7`]
  @scala.inline
  def `jdf-f16-8`: typings.ipp.ippStrings.`jdf-f16-8` = "jdf-f16-8".asInstanceOf[typings.ipp.ippStrings.`jdf-f16-8`]
  @scala.inline
  def `jdf-f16-9`: typings.ipp.ippStrings.`jdf-f16-9` = "jdf-f16-9".asInstanceOf[typings.ipp.ippStrings.`jdf-f16-9`]
  @scala.inline
  def `jdf-f18-1`: typings.ipp.ippStrings.`jdf-f18-1` = "jdf-f18-1".asInstanceOf[typings.ipp.ippStrings.`jdf-f18-1`]
  @scala.inline
  def `jdf-f18-2`: typings.ipp.ippStrings.`jdf-f18-2` = "jdf-f18-2".asInstanceOf[typings.ipp.ippStrings.`jdf-f18-2`]
  @scala.inline
  def `jdf-f18-3`: typings.ipp.ippStrings.`jdf-f18-3` = "jdf-f18-3".asInstanceOf[typings.ipp.ippStrings.`jdf-f18-3`]
  @scala.inline
  def `jdf-f18-4`: typings.ipp.ippStrings.`jdf-f18-4` = "jdf-f18-4".asInstanceOf[typings.ipp.ippStrings.`jdf-f18-4`]
  @scala.inline
  def `jdf-f18-5`: typings.ipp.ippStrings.`jdf-f18-5` = "jdf-f18-5".asInstanceOf[typings.ipp.ippStrings.`jdf-f18-5`]
  @scala.inline
  def `jdf-f18-6`: typings.ipp.ippStrings.`jdf-f18-6` = "jdf-f18-6".asInstanceOf[typings.ipp.ippStrings.`jdf-f18-6`]
  @scala.inline
  def `jdf-f18-7`: typings.ipp.ippStrings.`jdf-f18-7` = "jdf-f18-7".asInstanceOf[typings.ipp.ippStrings.`jdf-f18-7`]
  @scala.inline
  def `jdf-f18-8`: typings.ipp.ippStrings.`jdf-f18-8` = "jdf-f18-8".asInstanceOf[typings.ipp.ippStrings.`jdf-f18-8`]
  @scala.inline
  def `jdf-f18-9`: typings.ipp.ippStrings.`jdf-f18-9` = "jdf-f18-9".asInstanceOf[typings.ipp.ippStrings.`jdf-f18-9`]
  @scala.inline
  def `jdf-f2-1`: typings.ipp.ippStrings.`jdf-f2-1` = "jdf-f2-1".asInstanceOf[typings.ipp.ippStrings.`jdf-f2-1`]
  @scala.inline
  def `jdf-f20-1`: typings.ipp.ippStrings.`jdf-f20-1` = "jdf-f20-1".asInstanceOf[typings.ipp.ippStrings.`jdf-f20-1`]
  @scala.inline
  def `jdf-f20-2`: typings.ipp.ippStrings.`jdf-f20-2` = "jdf-f20-2".asInstanceOf[typings.ipp.ippStrings.`jdf-f20-2`]
  @scala.inline
  def `jdf-f24-1`: typings.ipp.ippStrings.`jdf-f24-1` = "jdf-f24-1".asInstanceOf[typings.ipp.ippStrings.`jdf-f24-1`]
  @scala.inline
  def `jdf-f24-10`: typings.ipp.ippStrings.`jdf-f24-10` = "jdf-f24-10".asInstanceOf[typings.ipp.ippStrings.`jdf-f24-10`]
  @scala.inline
  def `jdf-f24-11`: typings.ipp.ippStrings.`jdf-f24-11` = "jdf-f24-11".asInstanceOf[typings.ipp.ippStrings.`jdf-f24-11`]
  @scala.inline
  def `jdf-f24-2`: typings.ipp.ippStrings.`jdf-f24-2` = "jdf-f24-2".asInstanceOf[typings.ipp.ippStrings.`jdf-f24-2`]
  @scala.inline
  def `jdf-f24-3`: typings.ipp.ippStrings.`jdf-f24-3` = "jdf-f24-3".asInstanceOf[typings.ipp.ippStrings.`jdf-f24-3`]
  @scala.inline
  def `jdf-f24-4`: typings.ipp.ippStrings.`jdf-f24-4` = "jdf-f24-4".asInstanceOf[typings.ipp.ippStrings.`jdf-f24-4`]
  @scala.inline
  def `jdf-f24-5`: typings.ipp.ippStrings.`jdf-f24-5` = "jdf-f24-5".asInstanceOf[typings.ipp.ippStrings.`jdf-f24-5`]
  @scala.inline
  def `jdf-f24-6`: typings.ipp.ippStrings.`jdf-f24-6` = "jdf-f24-6".asInstanceOf[typings.ipp.ippStrings.`jdf-f24-6`]
  @scala.inline
  def `jdf-f24-7`: typings.ipp.ippStrings.`jdf-f24-7` = "jdf-f24-7".asInstanceOf[typings.ipp.ippStrings.`jdf-f24-7`]
  @scala.inline
  def `jdf-f24-8`: typings.ipp.ippStrings.`jdf-f24-8` = "jdf-f24-8".asInstanceOf[typings.ipp.ippStrings.`jdf-f24-8`]
  @scala.inline
  def `jdf-f24-9`: typings.ipp.ippStrings.`jdf-f24-9` = "jdf-f24-9".asInstanceOf[typings.ipp.ippStrings.`jdf-f24-9`]
  @scala.inline
  def `jdf-f28-1`: typings.ipp.ippStrings.`jdf-f28-1` = "jdf-f28-1".asInstanceOf[typings.ipp.ippStrings.`jdf-f28-1`]
  @scala.inline
  def `jdf-f32-1`: typings.ipp.ippStrings.`jdf-f32-1` = "jdf-f32-1".asInstanceOf[typings.ipp.ippStrings.`jdf-f32-1`]
  @scala.inline
  def `jdf-f32-2`: typings.ipp.ippStrings.`jdf-f32-2` = "jdf-f32-2".asInstanceOf[typings.ipp.ippStrings.`jdf-f32-2`]
  @scala.inline
  def `jdf-f32-3`: typings.ipp.ippStrings.`jdf-f32-3` = "jdf-f32-3".asInstanceOf[typings.ipp.ippStrings.`jdf-f32-3`]
  @scala.inline
  def `jdf-f32-4`: typings.ipp.ippStrings.`jdf-f32-4` = "jdf-f32-4".asInstanceOf[typings.ipp.ippStrings.`jdf-f32-4`]
  @scala.inline
  def `jdf-f32-5`: typings.ipp.ippStrings.`jdf-f32-5` = "jdf-f32-5".asInstanceOf[typings.ipp.ippStrings.`jdf-f32-5`]
  @scala.inline
  def `jdf-f32-6`: typings.ipp.ippStrings.`jdf-f32-6` = "jdf-f32-6".asInstanceOf[typings.ipp.ippStrings.`jdf-f32-6`]
  @scala.inline
  def `jdf-f32-7`: typings.ipp.ippStrings.`jdf-f32-7` = "jdf-f32-7".asInstanceOf[typings.ipp.ippStrings.`jdf-f32-7`]
  @scala.inline
  def `jdf-f32-8`: typings.ipp.ippStrings.`jdf-f32-8` = "jdf-f32-8".asInstanceOf[typings.ipp.ippStrings.`jdf-f32-8`]
  @scala.inline
  def `jdf-f32-9`: typings.ipp.ippStrings.`jdf-f32-9` = "jdf-f32-9".asInstanceOf[typings.ipp.ippStrings.`jdf-f32-9`]
  @scala.inline
  def `jdf-f36-1`: typings.ipp.ippStrings.`jdf-f36-1` = "jdf-f36-1".asInstanceOf[typings.ipp.ippStrings.`jdf-f36-1`]
  @scala.inline
  def `jdf-f36-2`: typings.ipp.ippStrings.`jdf-f36-2` = "jdf-f36-2".asInstanceOf[typings.ipp.ippStrings.`jdf-f36-2`]
  @scala.inline
  def `jdf-f4-1`: typings.ipp.ippStrings.`jdf-f4-1` = "jdf-f4-1".asInstanceOf[typings.ipp.ippStrings.`jdf-f4-1`]
  @scala.inline
  def `jdf-f4-2`: typings.ipp.ippStrings.`jdf-f4-2` = "jdf-f4-2".asInstanceOf[typings.ipp.ippStrings.`jdf-f4-2`]
  @scala.inline
  def `jdf-f40-1`: typings.ipp.ippStrings.`jdf-f40-1` = "jdf-f40-1".asInstanceOf[typings.ipp.ippStrings.`jdf-f40-1`]
  @scala.inline
  def `jdf-f48-1`: typings.ipp.ippStrings.`jdf-f48-1` = "jdf-f48-1".asInstanceOf[typings.ipp.ippStrings.`jdf-f48-1`]
  @scala.inline
  def `jdf-f48-2`: typings.ipp.ippStrings.`jdf-f48-2` = "jdf-f48-2".asInstanceOf[typings.ipp.ippStrings.`jdf-f48-2`]
  @scala.inline
  def `jdf-f6-1`: typings.ipp.ippStrings.`jdf-f6-1` = "jdf-f6-1".asInstanceOf[typings.ipp.ippStrings.`jdf-f6-1`]
  @scala.inline
  def `jdf-f6-2`: typings.ipp.ippStrings.`jdf-f6-2` = "jdf-f6-2".asInstanceOf[typings.ipp.ippStrings.`jdf-f6-2`]
  @scala.inline
  def `jdf-f6-3`: typings.ipp.ippStrings.`jdf-f6-3` = "jdf-f6-3".asInstanceOf[typings.ipp.ippStrings.`jdf-f6-3`]
  @scala.inline
  def `jdf-f6-4`: typings.ipp.ippStrings.`jdf-f6-4` = "jdf-f6-4".asInstanceOf[typings.ipp.ippStrings.`jdf-f6-4`]
  @scala.inline
  def `jdf-f6-5`: typings.ipp.ippStrings.`jdf-f6-5` = "jdf-f6-5".asInstanceOf[typings.ipp.ippStrings.`jdf-f6-5`]
  @scala.inline
  def `jdf-f6-6`: typings.ipp.ippStrings.`jdf-f6-6` = "jdf-f6-6".asInstanceOf[typings.ipp.ippStrings.`jdf-f6-6`]
  @scala.inline
  def `jdf-f6-7`: typings.ipp.ippStrings.`jdf-f6-7` = "jdf-f6-7".asInstanceOf[typings.ipp.ippStrings.`jdf-f6-7`]
  @scala.inline
  def `jdf-f6-8`: typings.ipp.ippStrings.`jdf-f6-8` = "jdf-f6-8".asInstanceOf[typings.ipp.ippStrings.`jdf-f6-8`]
  @scala.inline
  def `jdf-f64-1`: typings.ipp.ippStrings.`jdf-f64-1` = "jdf-f64-1".asInstanceOf[typings.ipp.ippStrings.`jdf-f64-1`]
  @scala.inline
  def `jdf-f64-2`: typings.ipp.ippStrings.`jdf-f64-2` = "jdf-f64-2".asInstanceOf[typings.ipp.ippStrings.`jdf-f64-2`]
  @scala.inline
  def `jdf-f8-1`: typings.ipp.ippStrings.`jdf-f8-1` = "jdf-f8-1".asInstanceOf[typings.ipp.ippStrings.`jdf-f8-1`]
  @scala.inline
  def `jdf-f8-2`: typings.ipp.ippStrings.`jdf-f8-2` = "jdf-f8-2".asInstanceOf[typings.ipp.ippStrings.`jdf-f8-2`]
  @scala.inline
  def `jdf-f8-3`: typings.ipp.ippStrings.`jdf-f8-3` = "jdf-f8-3".asInstanceOf[typings.ipp.ippStrings.`jdf-f8-3`]
  @scala.inline
  def `jdf-f8-4`: typings.ipp.ippStrings.`jdf-f8-4` = "jdf-f8-4".asInstanceOf[typings.ipp.ippStrings.`jdf-f8-4`]
  @scala.inline
  def `jdf-f8-5`: typings.ipp.ippStrings.`jdf-f8-5` = "jdf-f8-5".asInstanceOf[typings.ipp.ippStrings.`jdf-f8-5`]
  @scala.inline
  def `jdf-f8-6`: typings.ipp.ippStrings.`jdf-f8-6` = "jdf-f8-6".asInstanceOf[typings.ipp.ippStrings.`jdf-f8-6`]
  @scala.inline
  def `jdf-f8-7`: typings.ipp.ippStrings.`jdf-f8-7` = "jdf-f8-7".asInstanceOf[typings.ipp.ippStrings.`jdf-f8-7`]
  @scala.inline
  def `jog-offset`: typings.ipp.ippStrings.`jog-offset` = "jog-offset".asInstanceOf[typings.ipp.ippStrings.`jog-offset`]
  @scala.inline
  def laminate: typings.ipp.ippStrings.laminate = "laminate".asInstanceOf[typings.ipp.ippStrings.laminate]
  @scala.inline
  def punch: typings.ipp.ippStrings.punch = "punch".asInstanceOf[typings.ipp.ippStrings.punch]
  @scala.inline
  def `punch-bottom-left`: typings.ipp.ippStrings.`punch-bottom-left` = "punch-bottom-left".asInstanceOf[typings.ipp.ippStrings.`punch-bottom-left`]
  @scala.inline
  def `punch-bottom-right`: typings.ipp.ippStrings.`punch-bottom-right` = "punch-bottom-right".asInstanceOf[typings.ipp.ippStrings.`punch-bottom-right`]
  @scala.inline
  def `punch-dual-bottom`: typings.ipp.ippStrings.`punch-dual-bottom` = "punch-dual-bottom".asInstanceOf[typings.ipp.ippStrings.`punch-dual-bottom`]
  @scala.inline
  def `punch-dual-left`: typings.ipp.ippStrings.`punch-dual-left` = "punch-dual-left".asInstanceOf[typings.ipp.ippStrings.`punch-dual-left`]
  @scala.inline
  def `punch-dual-right`: typings.ipp.ippStrings.`punch-dual-right` = "punch-dual-right".asInstanceOf[typings.ipp.ippStrings.`punch-dual-right`]
  @scala.inline
  def `punch-dual-top`: typings.ipp.ippStrings.`punch-dual-top` = "punch-dual-top".asInstanceOf[typings.ipp.ippStrings.`punch-dual-top`]
  @scala.inline
  def `punch-multiple-bottom`: typings.ipp.ippStrings.`punch-multiple-bottom` = "punch-multiple-bottom".asInstanceOf[typings.ipp.ippStrings.`punch-multiple-bottom`]
  @scala.inline
  def `punch-multiple-left`: typings.ipp.ippStrings.`punch-multiple-left` = "punch-multiple-left".asInstanceOf[typings.ipp.ippStrings.`punch-multiple-left`]
  @scala.inline
  def `punch-multiple-right`: typings.ipp.ippStrings.`punch-multiple-right` = "punch-multiple-right".asInstanceOf[typings.ipp.ippStrings.`punch-multiple-right`]
  @scala.inline
  def `punch-multiple-top`: typings.ipp.ippStrings.`punch-multiple-top` = "punch-multiple-top".asInstanceOf[typings.ipp.ippStrings.`punch-multiple-top`]
  @scala.inline
  def `punch-quad-bottom`: typings.ipp.ippStrings.`punch-quad-bottom` = "punch-quad-bottom".asInstanceOf[typings.ipp.ippStrings.`punch-quad-bottom`]
  @scala.inline
  def `punch-quad-left`: typings.ipp.ippStrings.`punch-quad-left` = "punch-quad-left".asInstanceOf[typings.ipp.ippStrings.`punch-quad-left`]
  @scala.inline
  def `punch-quad-right`: typings.ipp.ippStrings.`punch-quad-right` = "punch-quad-right".asInstanceOf[typings.ipp.ippStrings.`punch-quad-right`]
  @scala.inline
  def `punch-quad-top`: typings.ipp.ippStrings.`punch-quad-top` = "punch-quad-top".asInstanceOf[typings.ipp.ippStrings.`punch-quad-top`]
  @scala.inline
  def `punch-top-left`: typings.ipp.ippStrings.`punch-top-left` = "punch-top-left".asInstanceOf[typings.ipp.ippStrings.`punch-top-left`]
  @scala.inline
  def `punch-top-right`: typings.ipp.ippStrings.`punch-top-right` = "punch-top-right".asInstanceOf[typings.ipp.ippStrings.`punch-top-right`]
  @scala.inline
  def `punch-triple-bottom`: typings.ipp.ippStrings.`punch-triple-bottom` = "punch-triple-bottom".asInstanceOf[typings.ipp.ippStrings.`punch-triple-bottom`]
  @scala.inline
  def `punch-triple-left`: typings.ipp.ippStrings.`punch-triple-left` = "punch-triple-left".asInstanceOf[typings.ipp.ippStrings.`punch-triple-left`]
  @scala.inline
  def `punch-triple-right`: typings.ipp.ippStrings.`punch-triple-right` = "punch-triple-right".asInstanceOf[typings.ipp.ippStrings.`punch-triple-right`]
  @scala.inline
  def `punch-triple-top`: typings.ipp.ippStrings.`punch-triple-top` = "punch-triple-top".asInstanceOf[typings.ipp.ippStrings.`punch-triple-top`]
  @scala.inline
  def `saddle-stitch`: typings.ipp.ippStrings.`saddle-stitch` = "saddle-stitch".asInstanceOf[typings.ipp.ippStrings.`saddle-stitch`]
  @scala.inline
  def staple: typings.ipp.ippStrings.staple = "staple".asInstanceOf[typings.ipp.ippStrings.staple]
  @scala.inline
  def `staple-bottom-left`: typings.ipp.ippStrings.`staple-bottom-left` = "staple-bottom-left".asInstanceOf[typings.ipp.ippStrings.`staple-bottom-left`]
  @scala.inline
  def `staple-bottom-right`: typings.ipp.ippStrings.`staple-bottom-right` = "staple-bottom-right".asInstanceOf[typings.ipp.ippStrings.`staple-bottom-right`]
  @scala.inline
  def `staple-dual-bottom`: typings.ipp.ippStrings.`staple-dual-bottom` = "staple-dual-bottom".asInstanceOf[typings.ipp.ippStrings.`staple-dual-bottom`]
  @scala.inline
  def `staple-dual-left`: typings.ipp.ippStrings.`staple-dual-left` = "staple-dual-left".asInstanceOf[typings.ipp.ippStrings.`staple-dual-left`]
  @scala.inline
  def `staple-dual-right`: typings.ipp.ippStrings.`staple-dual-right` = "staple-dual-right".asInstanceOf[typings.ipp.ippStrings.`staple-dual-right`]
  @scala.inline
  def `staple-dual-top`: typings.ipp.ippStrings.`staple-dual-top` = "staple-dual-top".asInstanceOf[typings.ipp.ippStrings.`staple-dual-top`]
  @scala.inline
  def `staple-top-left`: typings.ipp.ippStrings.`staple-top-left` = "staple-top-left".asInstanceOf[typings.ipp.ippStrings.`staple-top-left`]
  @scala.inline
  def `staple-top-right`: typings.ipp.ippStrings.`staple-top-right` = "staple-top-right".asInstanceOf[typings.ipp.ippStrings.`staple-top-right`]
  @scala.inline
  def `staple-triple-bottom`: typings.ipp.ippStrings.`staple-triple-bottom` = "staple-triple-bottom".asInstanceOf[typings.ipp.ippStrings.`staple-triple-bottom`]
  @scala.inline
  def `staple-triple-left`: typings.ipp.ippStrings.`staple-triple-left` = "staple-triple-left".asInstanceOf[typings.ipp.ippStrings.`staple-triple-left`]
  @scala.inline
  def `staple-triple-right`: typings.ipp.ippStrings.`staple-triple-right` = "staple-triple-right".asInstanceOf[typings.ipp.ippStrings.`staple-triple-right`]
  @scala.inline
  def `staple-triple-top`: typings.ipp.ippStrings.`staple-triple-top` = "staple-triple-top".asInstanceOf[typings.ipp.ippStrings.`staple-triple-top`]
  @scala.inline
  def trim: typings.ipp.ippStrings.trim = "trim".asInstanceOf[typings.ipp.ippStrings.trim]
  @scala.inline
  def `trim-after-copies`: typings.ipp.ippStrings.`trim-after-copies` = "trim-after-copies".asInstanceOf[typings.ipp.ippStrings.`trim-after-copies`]
  @scala.inline
  def `trim-after-documents`: typings.ipp.ippStrings.`trim-after-documents` = "trim-after-documents".asInstanceOf[typings.ipp.ippStrings.`trim-after-documents`]
  @scala.inline
  def `trim-after-job`: typings.ipp.ippStrings.`trim-after-job` = "trim-after-job".asInstanceOf[typings.ipp.ippStrings.`trim-after-job`]
  @scala.inline
  def `trim-after-pages`: typings.ipp.ippStrings.`trim-after-pages` = "trim-after-pages".asInstanceOf[typings.ipp.ippStrings.`trim-after-pages`]
}

