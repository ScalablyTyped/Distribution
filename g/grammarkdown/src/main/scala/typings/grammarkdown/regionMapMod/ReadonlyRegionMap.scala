package typings.grammarkdown.regionMapMod

import typings.grammarkdown.nodesMod.SourceFile
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadonlyRegionMap[T] extends js.Object {
  
  def findRegion(sourceFile: SourceFile, line: Double): js.UndefOr[Region[T]] = js.native
  
  def regions(sourceFile: SourceFile, line: Double): IterableIterator[Region[T]] = js.native
}
object ReadonlyRegionMap {
  
  @scala.inline
  def apply[T](
    findRegion: (SourceFile, Double) => js.UndefOr[Region[T]],
    regions: (SourceFile, Double) => IterableIterator[Region[T]]
  ): ReadonlyRegionMap[T] = {
    val __obj = js.Dynamic.literal(findRegion = js.Any.fromFunction2(findRegion), regions = js.Any.fromFunction2(regions))
    __obj.asInstanceOf[ReadonlyRegionMap[T]]
  }
  
  @scala.inline
  implicit class ReadonlyRegionMapOps[Self <: ReadonlyRegionMap[_], T] (val x: Self with ReadonlyRegionMap[T]) extends AnyVal {
    
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
    def setFindRegion(value: (SourceFile, Double) => js.UndefOr[Region[T]]): Self = this.set("findRegion", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegions(value: (SourceFile, Double) => IterableIterator[Region[T]]): Self = this.set("regions", js.Any.fromFunction2(value))
  }
}
