package typings.jest.mod.jest

import typings.jest.jestStrings.get
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.spyOn")
@js.native
object spyOn_get extends js.Object {
  /**
    * Creates a mock function similar to jest.fn but also tracks calls to `object[methodName]`
    *
    * Note: By default, jest.spyOn also calls the spied method. This is different behavior from most
    * other test libraries.
    *
    * @example
    *
    * const video = require('./video');
    *
    * test('plays video', () => {
    *   const spy = jest.spyOn(video, 'play');
    *   const isPlaying = video.play();
    *
    *   expect(spy).toHaveBeenCalled();
    *   expect(isPlaying).toBe(true);
    *
    *   spy.mockReset();
    *   spy.mockRestore();
    * });
    */
  def apply[T /* <: js.Object */, M /* <: NonFunctionPropertyNames[Required[T]] */](`object`: T, method: M, accessType: get): SpyInstance[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any, 
    js.Array[js.Any]
  ] = js.native
}

