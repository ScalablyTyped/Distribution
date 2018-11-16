```
/**
 * Contains simple low-level utility functions to manipulate the real DOM.
 */
/**
 * Welcome to the API documentation of the **maquette** library.
 *
 * [[https://maquettejs.org/|To the maquette homepage]]
 */
/**
 * A projector is used to create the real DOM from the the virtual DOM and to keep it up-to-date afterwards.
 *
 * You can call [[append]], [[merge]], [[insertBefore]] and [[replace]] to add the virtual DOM to the real DOM.
 * The `renderFunction` callbacks will be called to create the real DOM immediately.
 * Afterwards, the `renderFunction` callbacks will be called again to update the DOM on the next animation-frame after:
 *
 *  - The Projector's [[scheduleRender]] function  was called
 *  - An event handler (like `onclick`) on a rendered [[VNode]] was called.
 *
 * The projector stops when [[stop]] is called or when an error is thrown during rendering.
 * It is possible to use `window.onerror` to handle these errors.
 * Instances of [[Projector]] can be created using [[createProjector]].
 */
```