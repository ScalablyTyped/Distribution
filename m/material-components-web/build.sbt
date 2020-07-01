organization := "org.scalablytyped"
name := "material-components-web"
version := "5.1.0-bb772f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20200515Z-c5749f",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20200515Z-5bcbd5",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20200515Z-cc1c1d",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20200515Z-6b9c77",
  "org.scalablytyped" %%% "material__data-table" % "5.1.0-0bea2d",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20200515Z-9eb30f",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20200518Z-1fabda",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20200515Z-1d89e5",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20200515Z-1e3a09",
  "org.scalablytyped" %%% "material__icon-button" % "5.1.0-b1fb0c",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20200515Z-b1049e",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20200515Z-ee074e",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20200515Z-7770dd",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20200515Z-768631",
  "org.scalablytyped" %%% "material__menu-surface" % "5.1.0-aea702",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20200515Z-bdc640",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20200515Z-bb6961",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20200515Z-16f14e",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20200515Z-9b56f2",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20200515Z-42e23b",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20200515Z-7ca753",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20200515Z-1dc389",
  "org.scalablytyped" %%% "material__switch" % "5.1.0-84f773",
  "org.scalablytyped" %%% "material__tab" % "0.35-dt-20200515Z-2dd66a",
  "org.scalablytyped" %%% "material__tab-bar" % "5.1.0-a917d5",
  "org.scalablytyped" %%% "material__tab-indicator" % "5.1.0-310c6b",
  "org.scalablytyped" %%% "material__tab-scroller" % "5.1.0-94f2f8",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20200515Z-63abcd",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20200515Z-3bc8ab",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
