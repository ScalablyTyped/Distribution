package typings.lestate

import typings.lestate.anon.Force
import typings.lestate.anon.Id
import typings.lestate.anon.InitialState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lestate", "createState")
  @js.native
  def createState(): LeState = js.native
  @JSImport("lestate", "createState")
  @js.native
  def createState(props: InitialState): LeState = js.native
  
  @js.native
  trait LeState extends StObject {
    
    def createListener(options: Force): Unit = js.native
    
    def get(): js.Any = js.native
    
    def getDescription(): js.Object = js.native
    
    def insert(newValue: js.Object): Unit = js.native
    
    def set(newValue: js.Object): js.Array[Id] = js.native
  }
  object LeState {
    
    @scala.inline
    def apply(
      createListener: Force => Unit,
      get: () => js.Any,
      getDescription: () => js.Object,
      insert: js.Object => Unit,
      set: js.Object => js.Array[Id]
    ): LeState = {
      val __obj = js.Dynamic.literal(createListener = js.Any.fromFunction1(createListener), get = js.Any.fromFunction0(get), getDescription = js.Any.fromFunction0(getDescription), insert = js.Any.fromFunction1(insert), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[LeState]
    }
    
    @scala.inline
    implicit class LeStateMutableBuilder[Self <: LeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateListener(value: Force => Unit): Self = StObject.set(x, "createListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: () => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDescription(value: () => js.Object): Self = StObject.set(x, "getDescription", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInsert(value: js.Object => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: js.Object => js.Array[Id]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
}
