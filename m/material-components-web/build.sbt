organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-a7eb86"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-8fc1db",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-c9260a",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190313Z-2504e8",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-37f716",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190313Z-babeeb",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-1a6fbd",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-ced1eb",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190313Z-afde58",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-183771",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190313Z-76ab5a",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-5cef31",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-5c3b68",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-5235ed",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-f223f3",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-c2cf4d",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190313Z-a7af28",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-28e7a2",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190313Z-3c0c08",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-129fee",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190313Z-0b608b",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190313Z-7bc2c2",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190313Z-a2319a",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190313Z-aca9e8",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190313Z-c88e1b",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-6f8684",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        