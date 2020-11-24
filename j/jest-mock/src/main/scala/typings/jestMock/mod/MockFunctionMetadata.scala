package typings.jestMock.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MockFunctionMetadata[T, Y /* <: js.Array[_] */, Type] extends js.Object {
  
  var length: js.UndefOr[Double] = js.native
  
  var members: js.UndefOr[Record[String, MockFunctionMetadata[T, Y, MockFunctionMetadataType]]] = js.native
  
  var mockImpl: js.UndefOr[js.Function1[/* args */ Y, T]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var ref: js.UndefOr[Double] = js.native
  
  var refID: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[Type] = js.native
  
  var value: js.UndefOr[T] = js.native
}
object MockFunctionMetadata {
  
  @scala.inline
  def apply[T, Y /* <: js.Array[_] */, Type](): MockFunctionMetadata[T, Y, Type] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockFunctionMetadata[T, Y, Type]]
  }
  
  @scala.inline
  implicit class MockFunctionMetadataOps[Self <: MockFunctionMetadata[_, _, _], T, Y /* <: js.Array[_] */, Type] (val x: Self with (MockFunctionMetadata[T, Y, Type])) extends AnyVal {
    
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setMembers(value: Record[String, MockFunctionMetadata[T, Y, MockFunctionMetadataType]]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    
    @scala.inline
    def setMockImpl(value: /* args */ Y => T): Self = this.set("mockImpl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMockImpl: Self = this.set("mockImpl", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRef(value: Double): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefID(value: Double): Self = this.set("refID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefID: Self = this.set("refID", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
