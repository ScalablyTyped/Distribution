organization := "org.scalablytyped"
name := "material-components-web"
version := "8.0.0-1c2838"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__auto-init" % "8.0.0-9932f4",
  "org.scalablytyped" %%% "material__banner" % "8.0.0-90d331",
  "org.scalablytyped" %%% "material__base" % "8.0.0-4fe319",
  "org.scalablytyped" %%% "material__checkbox" % "8.0.0-e49c50",
  "org.scalablytyped" %%% "material__chips" % "8.0.0-5b6dea",
  "org.scalablytyped" %%% "material__circular-progress" % "8.0.0-0e77ce",
  "org.scalablytyped" %%% "material__data-table" % "8.0.0-2f942b",
  "org.scalablytyped" %%% "material__dialog" % "8.0.0-5a32ea",
  "org.scalablytyped" %%% "material__dom" % "8.0.0-3fb9fe",
  "org.scalablytyped" %%% "material__drawer" % "8.0.0-9a3192",
  "org.scalablytyped" %%% "material__floating-label" % "8.0.0-1cd35a",
  "org.scalablytyped" %%% "material__form-field" % "8.0.0-627440",
  "org.scalablytyped" %%% "material__icon-button" % "8.0.0-bbe7fb",
  "org.scalablytyped" %%% "material__line-ripple" % "8.0.0-50092d",
  "org.scalablytyped" %%% "material__linear-progress" % "8.0.0-f28ce2",
  "org.scalablytyped" %%% "material__list" % "8.0.0-29ecfa",
  "org.scalablytyped" %%% "material__menu" % "8.0.0-56995f",
  "org.scalablytyped" %%% "material__menu-surface" % "8.0.0-ed0324",
  "org.scalablytyped" %%% "material__notched-outline" % "8.0.0-7b9b18",
  "org.scalablytyped" %%% "material__progress-indicator" % "8.0.0-2c12e2",
  "org.scalablytyped" %%% "material__radio" % "8.0.0-0cb37e",
  "org.scalablytyped" %%% "material__ripple" % "8.0.0-2baa12",
  "org.scalablytyped" %%% "material__segmented-button" % "8.0.0-6c09b0",
  "org.scalablytyped" %%% "material__select" % "8.0.0-518f2e",
  "org.scalablytyped" %%% "material__slider" % "8.0.0-0912b2",
  "org.scalablytyped" %%% "material__snackbar" % "8.0.0-45b892",
  "org.scalablytyped" %%% "material__switch" % "8.0.0-bbc29f",
  "org.scalablytyped" %%% "material__tab" % "8.0.0-8552c7",
  "org.scalablytyped" %%% "material__tab-bar" % "8.0.0-3e4f05",
  "org.scalablytyped" %%% "material__tab-indicator" % "8.0.0-2be284",
  "org.scalablytyped" %%% "material__tab-scroller" % "8.0.0-0810da",
  "org.scalablytyped" %%% "material__textfield" % "8.0.0-8aafd6",
  "org.scalablytyped" %%% "material__tooltip" % "8.0.0-b8a5d6",
  "org.scalablytyped" %%% "material__top-app-bar" % "8.0.0-b24662",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
