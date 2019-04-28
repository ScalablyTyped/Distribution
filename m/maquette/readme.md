
# Scala.js typings for maquette

Typings are for version 3.3.3

## Library description:
Minimalistic Virtual DOM implementation with support for animated transitions.

|                    |                 |
| ------------------ | :-------------: |
| Full name          | maquette |
| Keywords           | virtual, dom, animation, transitions |
| # releases         | 22 |
| # dependents       | 11 |
| # downloads        | 30359 |
| # stars            | 0 |

## Links
- [Homepage](https://maquettejs.org/)
- [Bugs](https://github.com/AFASSoftware/maquette/issues)
- [Repository](https://github.com/AFASSoftware/maquette)
- [Npm](https://www.npmjs.com/package/maquette)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
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

