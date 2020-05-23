organization := "org.scalablytyped"
name := "ionic__angular"
version := "5.1.1-5f1a1b"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "9.1.9-82d5f1",
  "org.scalablytyped" %%% "angular__compiler" % "9.1.9-1e0b57",
  "org.scalablytyped" %%% "angular__core" % "9.1.9-28bd96",
  "org.scalablytyped" %%% "angular__forms" % "9.1.9-bc3225",
  "org.scalablytyped" %%% "angular__router" % "9.1.9-c60eb9",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-bb8752",
  "org.scalablytyped" %%% "ionic__core" % "5.1.1-2d0671",
  "org.scalablytyped" %%% "ionicons" % "5.0.1-218c99",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-1eb77e",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-d1f890",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200515Z-dc9245",
  "org.scalablytyped" %%% "typescript" % "3.9.3-b53cb0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
